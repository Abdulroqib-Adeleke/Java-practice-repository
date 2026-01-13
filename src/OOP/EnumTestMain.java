package OOP;

public class EnumTestMain {
    public static void main(String[] args){
        EnumTest day1 = new EnumTest(Days.MONDAY);
        day1.tellTheDay();
        EnumTest day2 = new EnumTest(Days.SATURDAY);
        day2.tellTheDay();
    }
}

class EnumTest{
    Days day;

    public EnumTest(Days day){
        this.day = day;
    }
    public void tellTheDay(){
        switch (day){
            case SATURDAY: case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("A work day");
                break;
        }
    }
}

enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
