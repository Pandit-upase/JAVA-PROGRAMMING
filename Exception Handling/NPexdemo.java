class Dog{
     
  public String DogName="TOMY";
}
public class NPexdemo
{
    public static void main(String[] args) {
       
        Dog dog =  null;
        try
        {
            System.out.println(dog.DogName);
        } 
        catch (NullPointerException e) 
        {
          Dog dog2=new Dog();
          System.out.println(dog2.DogName);
       //e.printStackTrace();
    }
  }
}
