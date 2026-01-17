package class_object_constructor;

public class Default_values_car
{
	    String make;
	    String model;
	    int year;

	    // Parameterized constructor with default value logic
	    Default_values_car(String make, String model, int year) 
	    {
	        // assign make (default = "Unknown Make")
	        if (make == null || make.isEmpty())
	        {
	            this.make = "Unknown Make";
	        } else 
	        {
	            this.make = make;
	        }

	        // assign model (default = "Unknown Model")
	        if (model == null || model.isEmpty()) 
	        {
	            this.model = "Unknown Model";
	        } else
	        {
	            this.model = model;
	        }

	        // assign year (default = 0)
	        if (year <= 0)
	        {
	            this.year = 0;
	        } 
	        else 
	        {
	            this.year = year;
	        }
	    }

	    void display() {
	        System.out.println("Make : " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year : " + year);
	        System.out.println("-----------------------------");
	    }

	    public static void main(String[] args) {

	    	Default_values_car c1 = new Default_values_car("Toyota", "Camry", 2022);
	        c1.display();

	        Default_values_car c2 = new Default_values_car("", "Civic", 2018);  // missing make
	        c2.display();

	        Default_values_car c3 = new Default_values_car("Honda", "", 0);     // missing model & invalid year
	        c3.display();

	        Default_values_car c4 = new Default_values_car(null, null, -5);     // all invalid
	        c4.display();
	    }
	}

