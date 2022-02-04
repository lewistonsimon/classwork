package week4;

public class ClassB {
    public static void main(String[] args) {
        ClassA x = new ClassA();
//        if (x.test(3) > 5)
//            System.out.print(x); // the void causes it not to run when it is inside the if statement

//        x = ClassA.doSomething();

//        x.test(Rectangle.computeArea());

        x.test(ClassA.doSomething().computeArea() + 5);

        x.test(x.test(new Rectangle(3, 4)));

    }
}
