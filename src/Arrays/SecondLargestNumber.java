package Arrays;

public class SecondLargestNumber {

    public static void main(String[] args){
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 29;
        numbers[2] = 34;
        numbers[3] = 4;
        numbers[4] = 107;
        numbers[5] = 38;
        numbers[6] = 70;
        numbers[7] = 45;
        numbers[8] = 11;
        numbers[9] = 10;

        int largest = 0;
        int secondL = 0;
        for(int num : numbers){
            if(num>largest)
                largest = num;
        }
        for (int num : numbers){
            if (num > secondL && num != largest)
                secondL = num;
        }
        System.out.println("The second largest value is: " + secondL);
    }
}
