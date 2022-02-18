package shapes;

import java.util.ArrayList;

public class ShapeTester {

    public static Square findBiggestSquare(Square[] squares){
        Square largestSquare = squares[0];

        for (Square square: squares)
            if (square.computeArea() > largestSquare.computeArea())
                largestSquare = square;

        return largestSquare;
    }

    //find biggest triangle

    //find biggest circle

    //find biggest shape
    public static Shape findBiggestShape(Shape[] shapes){
        Shape largestShape = shapes[0];

        for (Shape shape : shapes)
            if (shape.computeArea() > largestShape.computeArea())
                largestShape = shape;

        return largestShape;
    }


    public static void main(String[] args) {
//        Square[] arrayOfSquares =
//                {new Square(2), new Square(5), new Square(3)};
//        System.out.println(findBiggestSquare(arrayOfSquares));


//        Triangle[] arrayOfTriangle =
//                {new Triangle(2,4), new Triangle(5,1), new Triangle(3,2)};
//        System.out.println(findBiggestTriangle(arrayOfTriangle));


        Shape[] arrayOfShapes =
                {new Square(3), new Triangle(1,2), new Circle(4)};
        System.out.println(findBiggestShape(arrayOfShapes));

        Shape shape = new Circle(3);
        shape = new Triangle(2, 3);

    }

}
