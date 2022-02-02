package week3;

public class Pet {

    // attributes
    private static int totalNumberOfPets = 0;
    private String type;
    private String name;
    private int numberOfPets;

    // constructor
    public Pet(String type, String name, int number) {
        this.type = type;
        this.name = name;
        this.numberOfPets = number;
        totalNumberOfPets++;
    }

    // other methods
    public void petThePet(int times) {

        numberOfPets += times;
    }

    public static int getTotalNumberOfPets() {
        return totalNumberOfPets;
    }

    public void sameName(int x) {
        System.out.println("The int is x" + x);
    }

    public void sameName(String x) {
        System.out.println("The String is " + x);
    }


    public String toString () {
        String out = name + " is a " + type;
        out += " who has been petted " + numberOfPets + " times. ";
        return out;
    }
}
