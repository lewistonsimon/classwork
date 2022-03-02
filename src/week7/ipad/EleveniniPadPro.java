package week7.ipad;

import week7.ipad.ProductInterface;

public class EleveniniPadPro implements ProductInterface {

    private int memorySize;
    private boolean cellular;

    public EleveniniPadPro(int memory, boolean cellular) {

        this.memorySize = memory;
        this.cellular = cellular;
    }

    public double computePrice() {
        if (cellular) return ((11 * memorySize) + 150);
        else return (11 * memorySize);
    }

    public String toString() {

        return "The iPad has " + memorySize + "memory and cellular is " + cellular;
    }

}
