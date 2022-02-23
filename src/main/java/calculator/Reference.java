package calculator;

public class Reference {
    short s;
    byte b;
    char c;
    long l;
    double d;
    boolean bool;

    public static void main(String[] args) {
        int a = 1;
        passBy(a);
        System.out.println(a);


        String text = "Hello";
        passBy(text);
        System.out.println(text);
        
        Box box1 = new Box();
        System.out.println(box1);
        passBy(box1);
        System.out.println(box1.nazwa);

        Box box2 = new Box();
        System.out.println(box2);
        passBy(box2);
        System.out.println(box2.nazwa);
    }

    private static Box passBy(Box box) {
        box.nazwa = "Unboxing";
        return box;
    }

    private static void passBy(Box box, String nowaNazwa) {
        box.nazwa = nowaNazwa;
    }

    static void passBy(String text) {
        text = "Bye";
    }

    private static void passBy(int a) {
        a = 2;
    }


}
