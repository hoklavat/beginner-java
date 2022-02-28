import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(3, "Cat");
        myMap.put(5, "Dog");
        myMap.put(1, "Mouse");
        myMap.put(2, "Bird");

        for(int i = 0; i < 10; i++){
            if(myMap.containsKey(i)){
                System.out.println(myMap.get(i));
            }
        }

        System.out.print("Available Keys: ");
        for(int k: myMap.keySet())
            System.out.print(k + " ");
    }
}
