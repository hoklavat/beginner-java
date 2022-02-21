public class Base {
    public int baseInt;

    public Base(int b){
        System.out.println("This is base class constructor.");
        this.baseInt = b;
    }

    public static void print(){
        System.out.println("Hello from base class.\n");
    }
}
