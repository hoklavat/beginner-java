public class Person {
    //field
    private String name;
    private int age;
    private double height;

    //parameter constructor
    public Person(String n, int a, double h){
        this.name = n;
        this.age = a;
        this.height = h;
    }

    //empty constructor
    public Person(){
        this("None", 0, 0);
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //method
    public void print(){
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Height: " + this.height + "." );
    }
}
