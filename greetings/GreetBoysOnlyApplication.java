package greetings;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class GreetBoysOnlyApplication {

    public static void main(String...agrs) throws Exception {
        Path namesPath = Paths.get("greetings/friends.csv");
        List<String> lines = Files.readAllLines(namesPath);
        for ( String line: lines ) {
            if ( isBoy(line) ) {
                String name = getName(line);
                System.out.println("Hello, " + name);
            }
        }
    }

    public static String getName(String nameAndSex) {
        String[] parts = nameAndSex.split(",");
        String name = parts[0];
        return name;
    }

    public static boolean isBoy(String nameAndSex) {
        String[] parts = nameAndSex.split(",");
        String sex = parts[1];
        return sex.equals("m");
    }
}
