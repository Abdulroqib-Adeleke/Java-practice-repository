package OOP;

public class CardPayment {
    public static void main(String[] args) {
        PaymentTerminal terminal = new PaymentTerminal();
        PaymentCard card = new PaymentCard(100);

        System.out.println(card.balance());
        card.takeMoney(20);
        System.out.println(card.balance());
        card.addMoney(40);
        System.out.println(card.balance());
        System.out.println();

        terminal.eatAffordably(card);
        terminal.eatAffordably(50);
        System.out.println(terminal);
        terminal.eatHeartily(card);
        terminal.eatHeartily(100);
        System.out.println(card.balance());
        System.out.println(terminal);
        terminal.refundPayment(card, terminal.getHeartyMeal());
        System.out.println(card.balance());
        System.out.println(terminal);
    }
}

class PaymentCard{
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public void takeMoney(double amount) {
        if(this.balance >= amount){
            this.balance = this.balance - amount;
        }
    }
}

class PaymentTerminal{
    private double money;
    private int affordableMealsCount;
    private int heartyMealsCount;
    private final double affordableMeal = 2.50;
    private final double heartyMeal = 4.30;

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMealsCount = 0;
        this.heartyMealsCount = 0;
    }

    public double getAffordableMeal() {
        return affordableMeal;
    }

    public double getHeartyMeal() {
        return heartyMeal;
    }

    //Cash payment
    public void eatAffordably(double payment) {
        if(payment >= affordableMeal){
            this.money += affordableMeal;
            this.affordableMealsCount++;
        }
    }

    //Cash payment
    public void eatHeartily(double payment) {
        if(payment >= heartyMeal){
            this.money += heartyMeal;
            this.heartyMealsCount++;
        }
    }

    //Card payment
    public void eatAffordably(PaymentCard card){
        if(card.balance() >= affordableMeal){
            card.takeMoney(affordableMeal);
            this.money += affordableMeal;
            this.affordableMealsCount++;
        }
    }

    public void eatHeartily(PaymentCard card){
        if(card.balance() >= heartyMeal){
            card.takeMoney(heartyMeal);
            this.money += heartyMeal;
            this.heartyMealsCount++;
        }
    }

    //Refunding
    public void refundPayment(PaymentCard card, double amount){
        if(amount >= heartyMeal){
            card.addMoney(amount);
            this.money -= amount;
            this.heartyMealsCount--;
        }
        else if (amount >= affordableMeal){
            card.addMoney(amount);
            this.money -= amount;
            this.affordableMealsCount--;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMealsCount + ", number of sold hearty meals: " + heartyMealsCount;
    }
}
