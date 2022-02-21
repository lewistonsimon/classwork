package week7;

public class RegulariPad implements ProductInterface{

    private int memorySize;

    public RegulariPad(int memory) {
        this.memorySize = memory;
    }

    public double computePrice() {
        double price = 0;

        if (memorySize <= MEMORYSIZE_LEAST)
        {
            price = LOW_COST;
        }
        else
        {

        }

        return price;
    }

    public String toString() {
        return "The iPad has " + memorySize;
    }
}
