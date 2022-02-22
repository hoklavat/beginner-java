public class Main {

    public static void main(String[] args){
        Processor p = new Processor("Celeron");
        GraphicsCard g = new GraphicsCard("NVIDIA", 3.4);
        Memory m = new Memory(1024);

        Computer c = new Computer(p, g, m);
        c.getProcessor().Overclock();
        System.out.println("Computer graphics card is " + c.getGraphicsCard().getModel());
    }
}
