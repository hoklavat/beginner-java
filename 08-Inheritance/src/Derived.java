public class Derived extends Base{
    private int derivedInt;

    public Derived(int b, int d){
        super(b); //must be first.
        System.out.println("This is derived class constructor.");
        this.derivedInt = d;
    }

    public static void print(){
        System.out.println("Hello from derived class.\n");
    }
}
