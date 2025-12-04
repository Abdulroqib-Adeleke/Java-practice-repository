package OOP;

public class BankAccount {

    public static void main(String[] args){
        AccountAction account = new AccountAction("John");

        System.out.println(account.checkBalance());
        account.deposit(100);
        account.withdraw(120);
        System.out.println(account.checkBalance());
        account.withdraw(20);
        System.out.println(account.checkBalance());
        System.out.println(account);

    }
}

class AccountAction{
    private String accountName;
    private double balance;

    public AccountAction(String accountName){
        this.accountName = accountName;
    }

    public void deposit(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount){
        if(this.balance < amount)
            System.out.println("Insufficient fund");
        else
            this.balance -= amount;
    }

    public double checkBalance(){
        return this.balance;
    }


    public String toString() {
        return "Account name: " + accountName + ", balance: " + balance;
    }
}
