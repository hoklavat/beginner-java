public class A {
    private int a;

    public A(int a){
        this.a = a; //this.a is class member, a is constructor parameter.
    }

    public void a(){ //method name is same with field name.
        for(int a = 0; a < 10; a++){ //loop index name is same with field name.
            System.out.print(this.a * a + " ");
        }
    }
}
