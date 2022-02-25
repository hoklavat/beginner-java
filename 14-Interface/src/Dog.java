public class Dog implements ITalk{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Talk() {
        System.out.println("Woof!");
    }
}
