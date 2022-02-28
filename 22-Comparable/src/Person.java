public class Person implements Comparable<Person>{
    private int ID;
    private String name;

    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null || (obj.getClass() != this.getClass()))
            return false;
        int id = ((Person)obj).getID();
        return (this.ID == id);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 15;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", ID: " + this.ID + ".";
    }

    @Override
    public int compareTo(Person o) {
        if(this == o)
            return 0;
        if(o != null)
            return this.name.compareTo(o.getName());
        throw new NullPointerException();
    }
}
