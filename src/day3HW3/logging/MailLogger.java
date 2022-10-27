package day3HW3.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Maile Loglandý: " + data);
		
	}

}
