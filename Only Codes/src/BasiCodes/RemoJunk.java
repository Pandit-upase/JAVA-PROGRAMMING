package BasiCodes;

public class RemoJunk {

	public static void main(String[] args) {
		
		String s="@#$#@$#@$@#@Java *&&(*^#@@ Development";
		String s1="@#$#@$#@$@#@ python *&&(*^#@@ Development";
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		s1=s1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		System.out.println(s1);
	}
}
