public abstract class Animal {
    protected String name;
    protected int age;
    protected Object value;

    public Animal(String name, int age, Object value) {
        this.name = name;
        this.age = age;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Object getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract void Talk();
}
