package week5;

import week3.BankAccount;

public class BankAccountTester {
    public static void main(String[] args) {
//        Person tommy = new Person("Tommy", "111 111 1111", "222-222-2222");
//        BankAccount acct = new BankAccount("Tommy", 567);
//        System.out.println(acct);

        week3.BankAccount suzyAcct = new week3.BankAccount("Suzy");
        System.out.println(suzyAcct);

        week3.BankAccount accountTwo = new week3.BankAccount("Person 2");
        week3.BankAccount accountThree = new BankAccount("Person 3");
        System.out.println(accountTwo);
        System.out.println(accountThree);
        accountTwo.deposit(100);


//        acct.deposit(1000);
//        System.out.println(acct);
//        System.out.println(BankAccount.getNumberOfAccounts());

    }
}

