package quiz;

public class Vehicle {

    private int numberOfWheels;
    private String type;
    private String color;
    private String owner;

    public Vehicle(int wheels, String type, String color, String owner) {
        this.numberOfWheels = wheels;
        this.type = type;
        this.color = color;
        this.owner = owner;
    }

    public void sellVehicle(String newOwner) {
        this.owner = newOwner;
    }

    public String toString() {
        return owner + " is the owner of a " +
                color + " " + type + " that has " + numberOfWheels + " wheels.";
    }

}

