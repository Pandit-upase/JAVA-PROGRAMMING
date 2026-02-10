@FunctionalInterface
interface Printer {
    void print();
}

public class Fi {
    public static void main(String[] args) {

        Printer p = () -> System.out.println("Hello Java 8");

        p.print();
    }
}
