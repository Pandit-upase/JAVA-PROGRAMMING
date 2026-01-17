package BasiCodes;

public class countwordsinstring {
               
	public static void main(String[] args) {
		
		String  s="object oriented programming";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Words in string are " + count);
	}
}
