package application;

import entities.BusinessAccount;

public class Program {

    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount();

        account.setBalance(0.0);
        System.out.println(account.getBalance());
        account.deposit(100);
        System.out.println(account.getBalance());
        account.withdraw(20);
        System.out.println(account.getBalance());

    }
}
