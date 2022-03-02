package week7.ipad;

import week7.ipad.ProductInterface;

public class TwelveiniPadPro implements ProductInterface {

    private int memorySize;
    private boolean cellular;


    public TwelveiniPadPro(int memory, boolean cellular) {

        this.memorySize = memory;
        this.cellular = cellular;
    }

    public double computePrice() {
        if (cellular) return ((12 * memorySize) + 160);
        else return (12 * memorySize);
    }

    public String toString() {

        return "The iPad has " + memorySize + "memory and cellular is " + cellular;
    }

}
