package greetings;

public class GreetAllProgram { 
	public static void main (String...args) { 
		for(String name:args) { 
			String greeting = "Hello, "; 
			String greetByName = greeting + name;
			System.out.println(greetByName); 
		} 
	} 
}
