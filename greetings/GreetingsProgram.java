package greetings;

public class GreetingsProgram {
    public static void main(String...arguments) {
	String name = arguments[0];
	String greeting = "Hello, ";
	String greetByName = greeting + name;
	System.out.println(greetByName);
    }
}
