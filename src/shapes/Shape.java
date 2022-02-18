package shapes;

public interface Shape {
    final int DIME = 10;

    double computeArea();
    void doSomething(int x);

    static int multilply(int one, int two)
    {
        return one * two;
    }
}
