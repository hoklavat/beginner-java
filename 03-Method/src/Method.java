public class Method {

    public static int Sum(int a, int b){
        return (a+b);
    }

    //Method overloading
    public static int Sum(int a, int b, int c){
        return (a+b+c);
    }

    public static void main(String[] args){
        System.out.println("10 + 20 = " + Sum(10, 20));
        System.out.println("10 + 20 + 30 = " + Sum(10, 20, 30));
        System.out.println("10 * 20 = " + MultiplyClass.Multiply(10, 20));
        System.out.println("10 * 20 * 30 = " + MultiplyClass.Multiply(10, 20, 30));
    }
}
