import java.util.ArrayList;
import java.util.Collections;

public class Zoo<T extends Animal> {
    private String name;
    private ArrayList<T> group = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public boolean addAnimal(T a){
        if(group.contains(a)){
            return false;
        }else{
            group.add(a);
            return true;
        }
    }

    public void showAnimals(){
        Collections.sort(group);
        for(T a: group){
            System.out.println("Name: " + a.getName() + ", Age: " + a.getAge() + ".");
        }
    }
}