package week3;

public class PetTester {
    public static void main(String[] args) {
        Pet cat = new Pet("cat", "Bill", 5);
//        System.out.println(cat);
//        cat.petThePet(5);
//        System.out.println(cat);

        cat.sameName("four");
        System.out.println(Pet.getTotalNumberOfPets());
    }
}
