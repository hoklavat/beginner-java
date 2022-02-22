public class Processor {
    private String model;

    public Processor(String m){
        this.model = m;
    }

    public String getModel() {
        return model;
    }

    public void Overclock(){
        System.out.println("CPU is overclocked now.");
    }
}
