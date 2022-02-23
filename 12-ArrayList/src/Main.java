import java.util.ArrayList;

public class Main {

    public static void printAL(ArrayList<Person> a){
        for(int i = 0; i < a.size(); i++){
            System.out.println("Person " + i + ", Name: " + a.get(i).getName() +  ", Age: " + a.get(i).getAge());
        }
        System.out.println();
    }

    public static void main(String[] args){
        ArrayList<Person> p = new ArrayList<>();

        for(int i = 5; i > 0; i--){
            p.add(new Person("A"+i, i*10));
        }

        printAL(p);

        p.remove(2);
        printAL(p);

        p.set(3, new Person("Bob", 85));
        printAL(p);
    }
}
