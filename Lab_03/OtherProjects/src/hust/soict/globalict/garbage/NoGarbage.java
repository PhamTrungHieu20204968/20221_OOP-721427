package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) {
		String filename = "answer.txt";
		byte[] inputChars = {  };
		long startTime,endTime;
		
		try {
			inputChars = Files.readAllBytes(Paths.get(filename));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(1);
			e.printStackTrace();
		}
		startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b : inputChars) {
			outputString += (char)b;
		}
		
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		StringBuilder outputStringBuilder = new StringBuilder();
		for (byte b : inputChars) {
			outputStringBuilder.append(b);
		}
		
	}
	
	
}
