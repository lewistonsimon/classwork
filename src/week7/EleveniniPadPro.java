package week7;

public class EleveniniPadPro implements ProductInterface{

    private int memorySize;

    public EleveniniPadPro(int memory) {
        this.memorySize = memory;
    }

    public double computePrice() {
        double price = 0;

        if (memorySize == MEMORYSIZE_MIDDLE)
        {
            price = MIDDLE_COST;
        }
        else
        {

        }

        return price;
    }

    public String toString() {
        return "The iPad Pro 11 has " + memorySize;
    }

}
