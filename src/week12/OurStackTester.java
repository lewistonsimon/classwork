package week12;

public class OurStackTester {
    public static void main(String[] args) {
        String[] stackStarter = new String[10];
        OurStack<String> temp = new OurStack(stackStarter);

        temp.push("I");
        temp.push("am");
        temp.push("not");

        temp.pop();          // removes "not"
        temp.push("fine");
        String x = temp.peek();    // should be "fine"

        temp.push("how");
        temp.push("are");
        temp.push("you");

        String y = temp.pop();     // should be "you"

        System.out.println("x = " + x + " y = " + y);
        System.out.println(temp);  //should be ["I" "am" "fine" "how" "are"]

        Double[] stackNext = new Double[10];
        OurStack<Double> newTemp = new OurStack(stackNext);

        newTemp.push(22.3);
        newTemp.push(12.9);
        newTemp.push(9.3);

        newTemp.pop();           // removes "not"
        newTemp.push(4.43);
        double a = newTemp.peek();     // should be "fine"

        newTemp.push(32.3);
        newTemp.push(54.0);
        newTemp.push(678.4);

        double b = newTemp.pop();  // should be "you"

        System.out.println("x = " + a + " y = " + b);
        System.out.println(newTemp);


    }
}

