package week3;

public class BankAccountTester {
    public static void main(String[] args) {
//        Person tommy = new Person("Tommy", "111 111 1111", "222-222-2222");
//        BankAccount acct = new BankAccount("Tommy", 567);
//        System.out.println(acct);

        BankAccount suzyAcct = new BankAccount("Suzy");
        System.out.println(suzyAcct);

        BankAccount accountTwo = new BankAccount("Person 2");
        BankAccount accountThree = new BankAccount("Person 3");
        System.out.println(accountTwo);
        System.out.println(accountThree);


//        acct.deposit(1000);
//        System.out.println(acct);
//        System.out.println(BankAccount.getNumberOfAccounts());

    }
}
