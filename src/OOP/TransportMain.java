package OOP;

interface Transport {
    void move();
}
class Bus implements Transport{

    @Override
    public void move() {
        System.out.println("Bus is transporting passengers.");
    }
}
class Train implements Transport{

    @Override
    public void move() {
        System.out.println("Train is running on a railway track.");
    }
}
public class TransportMain{

    public static void main(String[] args) {
        Train train = new Train();
        Bus bus = new Bus();

        train.move();
        bus.move();
    }
}
