package day3HW3.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya Loglandý: "+data);
		
	}

}
