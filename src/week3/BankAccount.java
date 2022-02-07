package week3;

public class BankAccount {

    private static int nextId = 100;

    // Attributes (Instance Fields)
    private static int numberOfAccounts = 0;
    private String owner; // changes for all objects of the class
    private double balance;
    private int account;

    // Constructor (used to create objects)
    public BankAccount(String owner, int account) {
        this.owner = owner; // does not need this. Java will assume
        balance = 0;
        this.account = nextId; // since they both use account it has to have this.
        numberOfAccounts++;
    }

    public BankAccount(String owner) { // , int account, double balance
        this.owner = owner; // does not need this. Java will assume
        this.balance = balance;
        this.account = nextId++; // since they both use account it has to have this.
        numberOfAccounts++;
    }


    // Other methods
    public void deposit(double amount) { // no static because we use attribute
        if (amount >= balance) {
            this.balance += amount;
        }
        else {
            System.out.println("Insufficient funds.");
        }

//        public boolean equals(Object obj) {
//            if (obj instanceof BankAccount) {
//                BankAccount otherAcct = (BankAccount) obj;
//                return owner.equals(otherAcct.owner) &&
//                        accountNum == otherAcct.accountNum &&
//                        balance == otherAcct.balance;
//            } else return false;
//        }



    }

    public String sayHi() {
        return ("Hi");
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // toString method (used to convert objects to Strings in order to display them.) print

    public String toString() {
        return this.owner + " has account " + this.account + " with balance " + balance;
    }

//    public static void main(String[] args) {
//        BankAccount suzyAccount = new BankAccount("Suzy", 1234);
//        System.out.println(suzyAccount);
//        suzyAccount.deposit( 200);
//        System.out.println(suzyAccount);
//        suzyAccount.withdraw(100);
//        System.out.println(suzyAccount);
//    }
}
