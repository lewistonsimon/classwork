package week4;

import week4.BankAccount;

import javax.annotation.processing.SupportedAnnotationTypes;

public class TestAliases {
    public static void main(String[] args) {


        BankAccount acct1 = new BankAccount("Tom", 123);
        BankAccount acct2 = new BankAccount("Tom", 123);
        BankAccount acct3 = acct1;
        BankAccount acct4 = acct2;
        System.out.println(acct1 == acct2);
        System.out.println(acct1 == acct3);
        System.out.println(acct1.equals(acct2));
        System.out.println(acct1.equals(acct3));
    }


}
