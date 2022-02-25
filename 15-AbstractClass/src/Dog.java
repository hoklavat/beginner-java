public class Dog extends Animal{

    public Dog(String name, int age, Object value) {
        super(name, age, value);
    }

    @Override
    void Talk() {
        System.out.println("Woof!");
    }
}
