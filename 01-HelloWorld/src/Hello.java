import java.sql.SQLOutput;

public class Hello {

    public static void main(String[] args){
        System.out.println("Hello World!");

        int a = 10, b = 6;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MIN_VALUE-1);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MAX_VALUE+1);
        long c = 9_223_372_036_854_775_807L;
        System.out.println(c);
    }
}
