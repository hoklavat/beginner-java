public class Main {

    public static void main(String[] args){
        Dog d = new Dog("Lassie");
        Cat c = new Cat("Garfield");

        d.Talk();
        c.Talk();

        Talk(d);
        Talk(c);
    }

    public static void Talk(ITalk o){
        o.Talk(); //only interface methods.
    }
}
