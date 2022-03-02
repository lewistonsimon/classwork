package week7.ipad;

import week7.ipad.ProductInterface;

public class RegulariPad implements ProductInterface {

    private int memorySize;
    private boolean cellular;

    public RegulariPad(int memory, boolean cellular)
    {
        this.memorySize = memory;
        this.cellular = cellular;
    }

    public double computePrice() {
        if (cellular) return ((10 * memorySize) + 140);
        else return (10 * memorySize);

    }

    public String toString() {

        return "The iPad has " + memorySize + "memory and cellular is " + cellular;
    }
}
