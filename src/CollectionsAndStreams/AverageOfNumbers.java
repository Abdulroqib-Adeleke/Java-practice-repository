package CollectionsAndStreams;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, type \"end\" to stop.");
        List<String> inputs = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){

                double average = inputs.stream().mapToInt(s -> Integer.parseInt(s)).average().getAsDouble();
                System.out.println("average of the numbers: " + average);
                break;
            }
            inputs.add(input);
        }
    }
}

