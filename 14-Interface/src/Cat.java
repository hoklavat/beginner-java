public class Cat implements ITalk{
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Talk() {
        System.out.println("Meow!");
    }
}
