package class_object_constructor;

public class const_chain2
{
	const_chain2() 
	{
        this(5);
        System.out.println("This is Default Construtor");
    }

	const_chain2(int i)
	{
        this("Azhar Techno Coder");
        System.out.println("This is int type Construtor");
    }

	const_chain2(String s) 
	{
        super();  // calls Object class constructor
        System.out.println("String Constructor");
    }

    public static void main(String[] args) 
    {
    const_chain2 rv = new const_chain2();
    }
}
