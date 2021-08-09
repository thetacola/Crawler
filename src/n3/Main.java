package n3;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("--Test GET--");
		GetRequest.getTest();
		System.out.println("--BRCL GET--");
		GetRequest.getBRCL();
		System.out.println("--CLCR GET--");
		GetRequest.getCLCR();
	}
}
