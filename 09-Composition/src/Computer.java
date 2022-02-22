public class Computer {
    private Processor processor;
    private GraphicsCard graphicsCard;
    private Memory memory;

    public Computer(Processor processor, GraphicsCard graphicsCard, Memory memory) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public Memory getMemory() {
        return memory;
    }
}
