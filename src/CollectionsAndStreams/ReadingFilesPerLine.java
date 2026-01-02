package CollectionsAndStreams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a file name: ");
        String file = scan.nextLine();

        for(String line : read(file)){
            System.out.println(line);
        }
    }

    public static List<String> read(String file){
        try {
            return Files.lines(Paths.get(file)).collect(Collectors.toList());
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return List.of();
        }
    }

}
