interface MyInterface {
    void show();
}

public class Test {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            public void show() {
                System.out.println("Hello");
            }
        };
        obj.show();
    }
}
