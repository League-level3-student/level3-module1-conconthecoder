package _08_California_Weather;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather {
    
    void start() {
        HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter city name");
        String userName = myObj.nextLine();
        // All city keys have the first letter capitalized of each word
        String cityName = Utilities.capitalizeWords(userName);
        WeatherData datum = weatherData.get(cityName);
        if( datum == null ) {
            System.out.println("Unable to find weather data for: " + cityName);
        } else {
            System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
        }
        System.out.println("Enter 1 to find out cities with similar weathers conditions, and 2 to find cities in the desired temperature range");
        int dog = Integer.valueOf(myObj.nextLine());
        if (dog == 1) {
        	 System.out.println(cityName + " is " + datum.weatherSummary + ", and cities with similar conditions include " + datum.similarWeather(cityName));
        }
        else if ( dog == 2) {
        	System.out.println(" Enter low temp:");
        	double g = Double.valueOf(myObj.nextLine());
        	System.out.println(" Enter high temp:");
        	double f = Double.valueOf(myObj.nextLine());
        	System.out.println("Valid cities include: " + datum.goodTemp(f,g));
        }
    }
}
