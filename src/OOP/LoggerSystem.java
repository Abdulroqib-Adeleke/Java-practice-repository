package OOP;

import java.io.FileWriter;

public class LoggerSystem {
    public static void main(String[] args) {

        Loggable logger1 = new ConsoleLogger();
        logger1.log("Application started!");

        Loggable logger2 = new FileLogger("log.txt");
        logger2.log("This message goes into the file.");

        // Polymorphism
        Loggable activeLogger;
        activeLogger = logger1;
        activeLogger.log("Logging through polymorphism!");
    }
}
interface Loggable{
    void log(String message);
}
class ConsoleLogger implements Loggable{
    @Override
    public void log(String message) {
        System.out.println("[Console] " + message);
    }
}
class FileLogger implements Loggable{
    private final String fileName;

    public FileLogger(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        try(FileWriter writer = new FileWriter(fileName, true)){
            writer.write(message + "\n");
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
