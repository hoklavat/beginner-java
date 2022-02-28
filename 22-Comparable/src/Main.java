public class Main {

    public static void main(String[] args){
        Person p1 = new Person(123, "Abraham");
        Person p2 = new Person(456, "Boris");
        Person p3 = new Person(123, "Cicero");
        Person p4 = new Person(789, "Abraham");

        System.out.println("p1 = p2 -> " + p1.equals(p2)); //comparison by ID.
        System.out.println("p1 = p3 -> " + p1.equals(p3)); //comparison by ID.
        System.out.println("p1 compare to p4 -> "+ p1.compareTo(p4)); //comparison by name. equal to. 0
        System.out.println("p1 compare to p2 -> "+ p1.compareTo(p2)); //comparison by name. less than. negative
        System.out.println("p2 compare to p1 -> "+ p2.compareTo(p1)); //comparison by name. greater than. positive.

    }
}
