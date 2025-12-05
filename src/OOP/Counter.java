package OOP;

public class Counter {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment(){
        this.value++;
    }

    public void decrement(){
        if(this.value - 1 >= 0)
            this.value--;
    }
}
class CounterMain{
    public static void main(String[] args){
        Counter count = new Counter();

        count.setValue(50);
        count.decrement();
        System.out.println(count.getValue());
        count.increment();
        count.increment();
        count.increment();
        System.out.println(count.getValue());
    }
}
