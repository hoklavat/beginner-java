public class Cat extends Animal {

    public Cat(String name, int age, Object value) {
        super(name, age, value);
    }

    @Override
    void Talk() {
        System.out.println("Meow!");
    }
}
