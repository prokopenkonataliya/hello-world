package greetings;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class GreetAdults {

    public static void main(String...agrs) throws Exception {
        Path namesPath = Paths.get("greetings/friends.csv");
        List<String> lines = Files.readAllLines(namesPath);
        for ( String line: lines ) {
            if ( isAdult(line) ) {
                String name = getName(line);
                System.out.println("Hello, " + name);
            }
        }
    }

    public static String getName(String nameAndSexAndAge) {
        String[] parts = nameAndSexAndAge.split(",");
        String name = parts[0];
        return name;
    }

    public static boolean isGirls(String nameAndSexAndAge) {
        String[] parts = nameAndSexAndAge.split(",");
        String sex = parts[1];
        return sex.equals("f");
    }
    public static boolean isAdult(String nameAndSexAndAge) {
        String[] parts = nameAndSexAndAge.split(",");
        String ageString = parts[2];
        int age = Integer.parseInt(ageString);
        return age >= 21;
    }
}
