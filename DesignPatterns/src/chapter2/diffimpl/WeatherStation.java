package chapter2.diffimpl;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		HeatIndexDisplay heatIndaexDisplat = new HeatIndexDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
	
		weatherData.setMeasurment(30.0f, 200.0f, 55.5f);
		weatherData.setMeasurment(31.0f, 210.0f, 56.5f);
		weatherData.setMeasurment(32.0f, 220.0f, 57.5f);
		
		statisticsDisplay.display();
		
		
		
		
		


	}

}
