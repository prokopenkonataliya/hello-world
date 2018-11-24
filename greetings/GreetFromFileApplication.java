package greetings;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class GreetFromFileApplication {
    
    public static void main(String...agrs) throws Exception {
        Path namesPath = Paths.get("greetings/names.txt");
        List<String> names = Files.readAllLines(namesPath);
        for ( String name: names ) {
            System.out.println("Hello, " + name);
        }
    }
}
