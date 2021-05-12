package cap.beans;

import org.springframework.stereotype.Component;

@Component
public class Greet {
	public Greet()
	{
		System.out.println("Greet...");
	}
	public void welcomeMessage()
	{
		System.out.println("Hello, Welcome to Capgemini");
	}

}
