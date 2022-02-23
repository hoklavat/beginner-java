public class Dog extends Animal{
    public Dog(String n, int a){
        super(n, a);
    }

    @Override
    public void display(){
        System.out.println("Dog name is " + this.name + " and " + this.age + " years old.");
    }
}
