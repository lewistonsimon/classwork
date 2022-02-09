package week4;

public class ExtraMathFunctions {

    public static double percentOf(int percent, double number) {
        double result = number * (percent / 100.0);
        return result;
    }

    public static double findPercent(double firstNum, double secondNum) {
        double result = firstNum / secondNum * 100;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ExtraMathFunctions.percentOf(20, 115));
        System.out.println(ExtraMathFunctions.findPercent(100, 200));
    }
}

