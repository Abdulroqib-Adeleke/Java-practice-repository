package OOP;

import java.util.Scanner;

public class ATMUi {
    public static void showMenu(){
        System.out.println("ATM menu");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("Choose an option");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Account account = new Account("John", 1000);

        boolean running = true;
        while(running){
            showMenu();
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scan.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scan.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scan.close();
    }
}
class Account{
    private final String accountHolder;
    private double balance;

    public Account(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount + " successfully deposited");
        }else {
            System.out.println("Invalid amount");
        }
    }

    public boolean withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid withdrawal amount");
            return false;
        } else if (amount > balance) {
            System.out.println("insufficient fund");
            return false;
        }
        balance -= amount;
        System.out.println(amount + " successfully withdrawn");
        return true;
    }

    public double getBalance(){
        return balance;
    }
}
