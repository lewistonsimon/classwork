package shapes;

public class Square implements Shape{

    //instance variables
    private double side;

    //constructor
    public Square(double side) {
        this.side = side;
    }

    //class specific methods
    public double computeArea() {
        return side * side;
    }

    public void doSomething(int x){
        System.out.println("one");
    }


    //toString
    public String toString() {
        return "Square with side " + side;
    }
}

