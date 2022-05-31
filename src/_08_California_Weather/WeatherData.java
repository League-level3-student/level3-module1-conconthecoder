package _08_California_Weather;

import java.util.ArrayList;
import java.util.HashMap;

public class WeatherData {
    String weatherSummary;
    double temperatureF;
    
    public WeatherData(String summary, double temperatureF) {
        this.weatherSummary = summary;
        this.temperatureF = temperatureF;
    }
    
    public ArrayList<String> similarWeather( String cityName) {
    	HashMap<String, WeatherData> bog = Utilities.getWeatherData();
    	WeatherData datum = bog.get(cityName);
    	String currCondition = datum.weatherSummary;
    	ArrayList<String> doggie = new ArrayList<String>();
    	for (String i: bog.keySet()) {
    		datum = bog.get(i);
    		String g = datum.weatherSummary;
    		if (g.equals(currCondition)) doggie.add(i);
    	}
    	
    	return doggie;
    } 
    public ArrayList<String> goodTemp(double high, double low) {
    	HashMap<String, WeatherData> bog = Utilities.getWeatherData();
    	ArrayList<String> good = new ArrayList<String>();
    	for (String i: bog.keySet()) {
    		if (bog.get(i).temperatureF <= high && bog.get(i).temperatureF >= low) good.add(i);
    	}
    	return good;
    }
}
