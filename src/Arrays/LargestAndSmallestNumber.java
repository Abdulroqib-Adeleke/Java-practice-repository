package Arrays;

public class LargestAndSmallestNumber {

    public static void main(String[] args) {
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

        int smallest = numbers[0];
        int largest = numbers[9];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
