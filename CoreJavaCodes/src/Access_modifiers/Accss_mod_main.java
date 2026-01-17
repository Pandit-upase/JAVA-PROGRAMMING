package Access_modifiers;

    public class Accss_mod_main 
     
{
    	public static void main(String[] args) {

    		Access_modifiers  obj = new Access_modifiers ();
            obj.showValues(); // ✔ method is public so accessible

            // System.out.println(obj.a);  // ❌ private → NOT allowed outside class
            System.out.println(obj.b);     // ✔ default → allowed (same package)
            System.out.println(obj.c);     // ✔ protected → allowed in same package
            System.out.println(obj.d);     // ✔ public → allowed everywhere

            System.out.println("----------------------");

            Access_mod_ext child = new Access_mod_ext();
            child.display(); // ✔ shows protected behavior in subclass
        }
}
