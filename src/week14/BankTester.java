package week14;

public class BankTester {
    public static void main(String[] args) throws Exception{
             CreateSimpleBankDB.printDB();
//        BankAccountDB roseAccount = new BankAccountDB("Rose Bush");
//        System.out.println(roseAccount);
        BankAccountDB joeAccount = new BankAccountDB(10);
//        joeAccount.deposit(100.10);
        joeAccount.withdraw(100.10);
        System.out.println(joeAccount);
        System.out.println("Joe's balance is " + joeAccount.getBalance());
    }
}

