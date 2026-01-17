package BasiCodes;

public class countcharoccurence {
      public static void main(String[] args) {
		
    	  String s="Java programming python programming";
    	  
    	  int total_length=s.length();
    	  int totalafteremovingA=s.replaceAll("o","").length();
    	  
    	  int final_count=total_length-totalafteremovingA;
    	  System.out.println(final_count);
    	  
	}
}
