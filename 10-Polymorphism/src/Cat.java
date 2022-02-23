public class Cat extends Animal{
    public Cat(String n, int a){
        super(n, a);
    }

    @Override //polymorphism allows modification of base class methods and overriding them.
    public void display(){
        System.out.println("Cat name is " + super.name + " and " + super.age + " years old."); //super., this. or none.
    }
}
