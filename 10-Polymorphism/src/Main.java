public class Main {

    public static  void main(String[] args){
        Animal a = new Animal("Big Foot", 50);
        Animal c = new Cat("Garfield",3); //rather than base method overrided method is called because of @override keyword.
        Dog d = new Dog("Coyote",15);
        a.display();
        c.display();
        d.display();
    }

}
