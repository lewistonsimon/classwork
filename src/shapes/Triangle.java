package shapes;

public class Triangle implements Shape{

    //instance variables
    private double base;
    private double height;

    //constructor
    public Triangle(double base, double hgt) {
        this.base = base;
        height = hgt;
    }

    //Class specific methods
    public double computeArea() {
        return .5 * base * height;
    }

    public void doSomething(int x){
        System.out.println("two");
    }

    //toString
    public String toString() {
        return "Triangle with base " + base + " and height " + height;
    }
}

