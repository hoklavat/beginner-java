import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        int[] a = {5, 2, 7, 1, 1, 3, 8, 4, 0,7, 6, 9, 6};

        for(int i = 0; i < a.length; i++){
            s.add(a[i]); //add sorted, don't add duplicates.
        }

        for(int i: s){
            System.out.print(i + " ");
        }
    }
}
