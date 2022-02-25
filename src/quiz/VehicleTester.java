package quiz;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(4, "Ford truck",
                "blue", "James");
        System.out.println(vehicle1);
        vehicle1.sellVehicle("Kyle");
        System.out.println(vehicle1);
    }
}

