package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class MainTeste {

    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount();
        Account acc3 = new SavingAccount();


        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        //Apesar de não apresentar erro, em tempo de execução vai acusar erro
        BusinessAccount acc5 = (BusinessAccount)acc3;


    }
}
