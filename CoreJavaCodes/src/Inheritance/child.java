package Inheritance;

public class child implements Father,mother
{
	@Override
    public void work() 
	{
        Father.super.work();   // calling Father work()
        mother.super.work();   // calling Mother work()
        System.out.println("Child manages both roles");
    }
}

