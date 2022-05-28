package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class TesteOverride {

    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Rodrigo", 1000.00);
        acc1.withdraw(100);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(1002, "Rogério", 1000.00, 0.01);
        acc2.withdraw(100);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Ana", 1000.00, 500.00);
        acc3.withdraw(100);
        System.out.println(acc3.getBalance());
    }
}
