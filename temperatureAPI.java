import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class temperatureAPI {
	String Temperature(String userInput) throws IOException {
		//sets up the URL
		String myAPIurl = "https://api.openweathermap.org/data/2.5/weather?q=";	
		String myApiToken = "&APPID= (Openweathermap api key goes here)";
		//combines the components of the URL
		String weatherURL = myAPIurl + userInput + myApiToken; 
		// makes the URl an actual URl and goes to link
		URL url = new URL(weatherURL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
				}
				in.close();
		// gets the content from the URL
		String result = content + "";
		// parses the result from JSON and gets the required information from it
		// then have it convert from kelvin to farenheit 
		double kelvin = Double.parseDouble(parseJsonFunction(result));
		double Far = (kelvin * 1.8) - 459.67;
		// returns to the pircbot 
		return Double.toString(Far);
	}
	public static String parseJsonFunction(String json) 
	{
		// parses through the JSON to find the required information
	JsonObject object = new JsonParser().parse(json).getAsJsonObject();
	JsonObject main = object.getAsJsonObject("main");
	double temp = main.get("temp").getAsDouble();
	//converts to a string so that it can be returned to the main function
	String temp2 = Double.toString(temp);
	return temp2; 
	}
}
