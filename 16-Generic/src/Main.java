public class Main {

    public static void main(String[] args){

        Zoo<Animal<Dog>> dogs = new Zoo<>("Dogs");
        Animal<Dog> dog1 = new Animal<>("Fred", 8);
        Animal<Dog> dog2 = new Animal<>("Barnie", 10);
        Animal<Dog> dog3 = new Animal<>("Yogi", 12);
        dogs.addAnimal(dog1);
        dogs.addAnimal(dog2);
        dogs.addAnimal(dog3);

        Zoo<Animal<Cat>> cats = new Zoo<>("Cats");
        Animal<Cat> cat1 = new Animal<>("Tom", 4);
        Animal<Cat> cat2 = new Animal<>("Garfield", 5);
        Animal<Cat> cat3 = new Animal<>("Kermit", 6);
        cats.addAnimal(cat1); //dog type will give error.
        cats.addAnimal(cat2);
        cats.addAnimal(cat3);

        System.out.println("- Dogs -");
        dogs.showAnimals();

        System.out.println("- Cats -");
        cats.showAnimals();
    }
}
