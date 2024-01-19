package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        // Creating accounts
        System.out.println("Enter account details for account1:");
        Account account1 = createAccount(scanner);

        System.out.println("Enter account details for account2:");
        Account account2 = createAccount(scanner);

        System.out.println("Enter account details for account3:");
        Account account3 = createAccount(scanner);

        // Adding accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Displaying initial account information
        displayAccountInfo(bank);

        // Depositing money into account1
        System.out.println("\nEnter the amount to deposit into account1:");
        double depositAmount = scanner.nextDouble();
        bank.depositMoney(account1, depositAmount);

        // Displaying updated account information
        System.out.println("\nAfter depositing " + depositAmount + " into account1:");
        displayAccountInfo(bank);

        // Withdrawing money from account3
        System.out.println("\nEnter the amount to withdraw from account3:");
        double withdrawAmount = scanner.nextDouble();
        bank.withdrawMoney(account3, withdrawAmount);

        // Displaying updated account information
        System.out.println("\nAfter withdrawing " + withdrawAmount + " from account3:");
        displayAccountInfo(bank);

        // Closing the scanner
        scanner.close();
    }

    private static Account createAccount(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        return new Account(name, accountNumber, balance);
    }

    private static void displayAccountInfo(Bank bank) {
        ArrayList<Account> accounts = bank.getAccounts();

        System.out.println("\nAccount Information:");
        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }
    }
}

