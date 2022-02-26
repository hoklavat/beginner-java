public class Animal<T> implements Comparable<Animal<T>> {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Animal<T> a){
        if(this.age > a.age){
            return 1;
        }else if(this.age < a.age){
            return -1;
        }
        System.out.println("Age Difference is " + (this.age - a.age));
        return 0;
    }
}
