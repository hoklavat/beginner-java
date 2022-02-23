import java.util.*;

public class Main {

    public static void printLL(LinkedList<Person> p){
        ListIterator<Person> i = p.listIterator();
        while(i.hasNext()){
            System.out.println("Name: " + i.next());
        }
    }

    public static void main(String[] args){
        LinkedList<Person> p = new LinkedList<>();
        p.add(new Person("Adam", 10));
        p.add(new Person("John", 30));
        p.add(new Person("Boris", 50));
        p.add(new Person("David", 20));
        p.add(new Person("Sullivan", 40));

        printLL(p);

        System.out.println("Press 2 for next, 1 for previous: ");
        boolean quit = false;
        Scanner s = new Scanner(System.in);
        ListIterator<Person> i = p.listIterator();
        while(!quit){
            int key = s.nextInt();
            switch(key){
                case 2:
                    if(i.hasNext()){
                        System.out.println(i.next().getName());
                    }else{
                        System.out.println("End.");
                    }
                    break;
                case 1:
                    if(i.hasPrevious()){
                        System.out.println(i.previous().getName());
                    }else{
                        System.out.println("Start.");
                    }
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }
}
