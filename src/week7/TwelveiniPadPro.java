package week7;

public class TwelveiniPadPro implements ProductInterface {

    private int memorySize;

    public TwelveiniPadPro(int memory) {
        this.memorySize = memory;
    }

    public double computePrice() {
        double price = 0;

        if (memorySize >= MEMORYSIZE_MOST)
        {
            price = HIGH_COST;
        }
        else
        {

        }

        return price;
    }

    public String toString() {
        return "The iPad Pro 12.9 has " + memorySize;
    }

}
