package class_object_constructor;

public class Bank_const_ovl_main
{
	public static void main(String[] args) {

		Bank_const_ovl b1 = new Bank_const_ovl();                                         
		Bank_const_ovl b2 = new Bank_const_ovl("Rohit Sharma");                           
		Bank_const_ovl b3 = new Bank_const_ovl("Virat Kohli", 9876543210L);              
		Bank_const_ovl b4 = new Bank_const_ovl("Mahendra Singh", 9123456780L, 90000); 
		
		b1.show();
        b2.show();
        b3.show();
        b4.show();
}
}
