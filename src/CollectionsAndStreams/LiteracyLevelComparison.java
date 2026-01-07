package CollectionsAndStreams;


import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyLevelComparison {

    public static void main(String[] args) {

        try{
            Files.lines(Paths.get("literacy.csv")).map(row -> row.split(","))
                    .sorted((a, b) -> Double.compare(Double.parseDouble(a[5]), Double.parseDouble(b[5])))
                    .forEach(parts ->
                            System.out.println(
                                    parts[3] + " (" + parts[4] + "), " + parts[2].replace("(%)", "").trim()
                                            + ", " + parts[5]));
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
