public class Animal {
    protected String name; //protected field is accessible from derived classes.
    protected int age;

    public Animal(String n, int a){
        this.name = n;
        this.age = a;
    }

    public void display(){
        System.out.println("Animal name is " + this.name + " and " + this.age + " years old.");
    }
}
