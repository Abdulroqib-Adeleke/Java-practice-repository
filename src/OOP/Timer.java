package OOP;

public class Timer {
    private final ClockHand second;
    private final ClockHand milliSec;

    public Timer(){
        this.second = new ClockHand(60);
        this.milliSec = new ClockHand(100);
    }
    public void advance(){
        this.milliSec.advance();

        if(this.milliSec.value() == 0){
            this.second.advance();
        }
    }
    public String toString(){
        return second + ":" + milliSec;
    }

}
class ClockHand {

    private int value;
    private final int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}
class TimerMain{
    public static void main() {
        Timer timer = new Timer();

        while (true){
            System.out.println(timer);
            timer.advance();
        }
    }
}
