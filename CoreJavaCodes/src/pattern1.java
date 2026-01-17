public class pattern1 {
    public static void main (String[]args) 
    {
        char ch = 'A';
        int num = 5;

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                if(i >= j) {
                    System.out.print(ch++ + "");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
