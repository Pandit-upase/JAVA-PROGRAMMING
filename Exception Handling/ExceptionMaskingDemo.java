public class ExceptionMaskingDemo {

    static int calculate() {
        try {
            System.out.println("Inside try");
            int a = 10 / 0;   // ArithmeticException
            return 10;
        } catch (ArithmeticException e) {
            System.out.println("Inside catch");
            return 20;
        } finally {
            System.out.println("Inside finally");
            return 30;   // Overrides everything (BAD PRACTICE)
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + calculate());
    }
}
