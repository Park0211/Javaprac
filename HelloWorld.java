public class HelloWorld {
    public static void main (String [] arg) {
        System.out.println("hello world");
        test("hello");

    }

    public static void test(String test) {
        System.out.println("void method" + test);
        int a = 1;
        int b = 2;

        if (a == b) {
            System.out.println("TRUE!");
        } else {
            System.out.println("False");
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }
}