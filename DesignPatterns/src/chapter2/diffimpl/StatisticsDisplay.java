package chapter2.diffimpl;

import java.util.*;

public class StatisticsDisplay implements Observer, DisplayElement {
	private List<Float> tempList;
	private List<Float> humidityList;
	private List<Float> pressureList;

	public StatisticsDisplay(Observable observable) {
		tempList = new ArrayList<Float>();
		humidityList = new ArrayList<Float>();
		pressureList = new ArrayList<Float>();
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable observable, Object obj) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			tempList.add(weatherData.getTemperature());
			humidityList.add(weatherData.getHumidity());
			pressureList.add(weatherData.getPressure());
		}
	}
	
	@Override
	public void display() {
		System.out.println("Temperature = " + tempList);
		System.out.println("Humidity = " + humidityList);
		System.out.println("Pressure = " + pressureList);
		
	}

}
