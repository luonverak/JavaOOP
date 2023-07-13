package Exercise4;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount() {
    }
    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getAccountHolderName() {
        return this.accountHolderName;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    public void createAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter AccountNumber     = "); accountNumber=scanner.nextInt();
        System.out.print("Enter Balance           = "); balance=scanner.nextDouble();scanner.nextLine();
        System.out.print("Enter AccountHolderName = "); accountHolderName=scanner.nextLine();
    }

    public void deposit(BankAccount destinationAccount,double amount) {
        if (amount < 0) {
            System.out.println("Amount must be greater than or equal to 0.");
            return;
        }
        destinationAccount.balance += amount;
    }

    public void withdraw(BankAccount destinationAccount,double amount) {
        if (amount > this.balance && amount < 0) {
            System.out.println("Insufficient funds.");
            return;
        }
        destinationAccount.balance -= amount;
    }
       
    public void transfer(BankAccount sender,BankAccount destinationAccount, double amount) {
        sender.balance -= amount;
        destinationAccount.balance += amount;
        System.out.println("your balance = "+sender.balance);
        System.out.println(destinationAccount.accountHolderName + " balance = "+destinationAccount.balance);
    }
    public void generateReport() {
        System.out.println(accountHolderName+"\t"+accountNumber+"\t"+balance);
    }
}
