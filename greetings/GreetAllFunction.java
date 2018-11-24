package greetings;

public class GreetAllFunction{ 
	public static void main (String...args) { 
		for(String name:args) { 
			String hello = sayHello(name);
			System.out.println(hello);
		} 
	} 
	
	public static String sayHello(String helloName) {
		String greeting = "Hello, "; 
		String greetByName = greeting + helloName;
		return greetByName;
	}
}
