package Access_modifiers;

public class Access_mod_ext extends Access_modifiers

{
	    void display() 
	{
        // System.out.println(a);   // ❌ private → NOT accessible
        System.out.println(b);      // ✔ default → accessible (same package)
        System.out.println(c);      // ✔ protected → accessible in child
        System.out.println(d);      // ✔ public → accessible
    }
}
