package Arrays;

public class ArraySummation {

    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Sum is: " + sum);
    }
}
