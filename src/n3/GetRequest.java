package n3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class GetRequest {
	public static void getTest() throws IOException {
		//this is a test method, will be removed later
		//just want to make sure that this actually works...
		URL getTestURL = new URL("https://jsonplaceholder.typicode.com/posts/1");
		String readLine = null;
		HttpURLConnection testConnection = (HttpURLConnection) getTestURL.openConnection();
		testConnection.setRequestMethod("GET");
		testConnection.setRequestProperty("userId", "a1bcdef");
		int testResponseCode = testConnection.getResponseCode();
		
		if (testResponseCode == HttpURLConnection.HTTP_OK) {
			System.out.println("HTTP Code " + testResponseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader(testConnection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			} 
			in.close();
			//print result
			System.out.println("JSON String Result " + response.toString());
		} else {
			System.out.println("Error: HTTP Code " + testResponseCode);
		}
	}
	public static void getBRCL() throws IOException {
		URL getBRCLURL = new URL("http://registry.brightraven.eu/api/v1/codes");
		String readLine = null;
		HttpURLConnection BRCLConnection = (HttpURLConnection) getBRCLURL.openConnection();
		BRCLConnection.setRequestMethod("GET");
		//testConnection.setRequestProperty("userId", "a1bcdef");
		int BRCLResponseCode = BRCLConnection.getResponseCode();
		
		if (BRCLResponseCode == HttpURLConnection.HTTP_OK) {
			System.out.println("HTTP Code " + BRCLResponseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader(BRCLConnection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			} 
			in.close();
			//print result
			System.out.println("JSON String Result " + response.toString());
		} else {
			System.out.println("Error: HTTP Code " + BRCLResponseCode);
		}
	}
	public static void getCLCR() throws IOException {
		URL getCLCRURL = new URL("http://www.kreativekorp.com/clcr/json.php");
		String readLine = null;
		HttpURLConnection CLCRConnection = (HttpURLConnection) getCLCRURL.openConnection();
		CLCRConnection.setRequestMethod("GET");
		//testConnection.setRequestProperty("userId", "a1bcdef");
		int CLCRResponseCode = CLCRConnection.getResponseCode();
		
		if (CLCRResponseCode == HttpURLConnection.HTTP_OK) {
			System.out.println("HTTP Code " + CLCRResponseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader(CLCRConnection.getInputStream()));
			StringBuffer response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			} 
			in.close();
			//print result
			
			String CLCRJSONString = response.toString();
			String newString = "{" + CLCRJSONString + "}";
			
			System.out.println("JSON String Result " + CLCRJSONString);
			
			JSONObject obj = new JSONObject(CLCRJSONString);
			JSONArray arr = obj.getJSONArray("source"); // notice that `"posts": [...]`
			for (int i = 0; i < arr.length(); i++)
			{
			    String post_id = arr.getJSONObject(i).getString("post_id");
			}
			
			
		} else {
			System.out.println("Error: HTTP Code " + CLCRResponseCode);
		}
	}
	
	public static void getISO() throws IOException {
		//placeholder
	}
}
