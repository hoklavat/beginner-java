public class Main {

    public static void main(String[] args){
        Base b = new Base(10);
        b.print();

        Base d1 = new Derived(10,20);
        d1.print();

        Derived d2 = new Derived(30,40);
        d2.print();
    }
}
