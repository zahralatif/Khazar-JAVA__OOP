package Bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void depositMoney(Account account, double depositAmount) {
        account.deposit(depositAmount);
    }

    public void withdrawMoney(Account account, double withdrawAmount) {
        account.withdraw(withdrawAmount);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
