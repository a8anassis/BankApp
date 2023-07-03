package gr.aueb.cf;

import gr.aueb.cf.exceptions.InsufficientBalanceException;
import gr.aueb.cf.exceptions.NegativeAmountException;
import gr.aueb.cf.exceptions.SsnNotValidException;
import gr.aueb.cf.model.Account;
import gr.aueb.cf.model.OverdraftAccount;
import gr.aueb.cf.model.OverdraftJointAccount;
import gr.aueb.cf.model.User;

public class Main {

    public static void main(String[] args) {
        User a8an = new User("Ath.", "A.", "12345");
        User anna = new User("Anna", "G.", "56789");
        Account account = new Account(a8an, "GR12345", 100);
        Account overA8an = new OverdraftAccount(a8an, "GR23456", 50);
        Account overJointAccount = new OverdraftJointAccount(a8an, "GR256789", 200.50, anna);

        try {
            System.out.println("Account: \n" + account);
            System.out.println("Overdraft: \n" + overA8an);

            overJointAccount.deposit(100);
            overJointAccount.withdraw(50, "16789");

            System.out.println("Overdraft joint account: \n" + overJointAccount);
        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
