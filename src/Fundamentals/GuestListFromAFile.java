package TheBasics;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scan.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                list.add(row);
            }
        }

        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("On the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}

