public class Main {

    public static void main(String[] args){
        Dog d = new Dog("Lassie",10,32.9);
        Cat c = new Cat("Garfield", 5, 'G');

        d.Talk();
        c.Talk();

        System.out.println(d.getValue());
        System.out.println(c.getValue());

    }
}
