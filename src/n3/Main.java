package n3;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("--Test GET--");
		GetRequest.getTest();
		System.out.println("--BRCL GET--");
		GetRequest.getBRCL();
		System.out.println("--CLCR GET--");
		String[][] CLCRArray = GetRequest.getCLCR(); //For second number, meaning is as follows: 
		//0 - Source; 1 - Short Code; 2 - Long Code; 3 - Name; 4 - URL; 5 - Author; 6 - Date
		
		//the following is a test to show the capabilities of the GET request.
		int random = (int)(Math.random()*236);
		System.out.println((random + 1) + " entry's source: " + CLCRArray[random][0]);
		System.out.println((random + 1) + " entry's code: " + CLCRArray[random][1]);
		if (CLCRArray[random][2] != null && !CLCRArray[random][2].isEmpty()) {
			System.out.println((random + 1) + " entry's long code: " + CLCRArray[random][2]);
		}
		System.out.println((random + 1) + " entry's name: " + CLCRArray[random][3]);
		System.out.println((random + 1) + " entry's URL: " + CLCRArray[random][4]);
		System.out.println((random + 1) + " entry's author: " + CLCRArray[random][5]);
		System.out.println((random + 1) + " entry's date of creation: " + CLCRArray[random][6]);
	}
}
