package Abstraction_with_interface;

public class InterfaceMain 
{
    public static void main(String[] args)
    {

        Notification n;

        n = new Email();
        n.sendMessage();

        n = new SMS();
        n.sendMessage();
    }
}
