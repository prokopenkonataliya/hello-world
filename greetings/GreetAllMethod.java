package greetings;

public class GreetAllMethod{ 
	public static void main (String...args) { 
		for(String name:args) { 
			sayHello(name);
		} 
	} 
	
	public static void sayHello(String helloName) {
		String greeting = "Hello, "; 
		String greetByName = greeting + helloName;
		System.out.println(greetByName); 
	}
}
