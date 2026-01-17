package Abstraction_with_interface;

interface Notification
{
    void sendMessage();
}

class Email implements Notification
{
    public void sendMessage()
    {
        System.out.println("Email sent to customer");
    }
}

class SMS implements Notification
{
    public void sendMessage()
    {
        System.out.println("SMS sent to customer");
    }
}

