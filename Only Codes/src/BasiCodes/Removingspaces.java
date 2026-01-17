package BasiCodes;

public class Removingspaces {

	public static void main(String[] args) {
		
		String s="Java  Development";
		System.out.println("Before removing spaces-->" + s);
		
		s=s.replaceAll("\\s", "");
		System.out.println("After removing-->" + s);
	}
}
