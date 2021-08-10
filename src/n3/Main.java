package n3;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("--Test GET--");
		GetRequest.getTest();
		System.out.println("--BRCL GET--");
		GetRequest.getBRCL();
		System.out.println("--CLCR GET--");
		String[][] CLCRArray = GetRequest.getCLCR();
		System.out.println("94th entry's source: " + CLCRArray[93][0]);
		System.out.println("94th entry's code: " + CLCRArray[93][1]);
		System.out.println("94th entry's name: " + CLCRArray[93][3]);
		System.out.println("94th entry's URL: " + CLCRArray[93][4]);
		System.out.println("94th entry's author: " + CLCRArray[93][5]);
		System.out.println("94th entry's date of creation: " + CLCRArray[93][6]);
	}
}
