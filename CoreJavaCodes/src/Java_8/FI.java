package Java_8;

//When we add @FunctionalInterface annotation then only one abstract method can be created in
//interface.without this annotation    you can have many abstract methods.

@FunctionalInterface
public interface FI 
{
  void display();
  //void show();
}
