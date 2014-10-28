package chapter2.firstimpl;

import java.util.*;

public class StatisticsDisplay implements Observer, DisplayElement {
	private List<Float> tempList;
	private List<Float> humidityList;
	private List<Float> pressureList;

	public StatisticsDisplay(Subject subject) {
		tempList = new ArrayList<Float>();
		humidityList = new ArrayList<Float>();
		pressureList = new ArrayList<Float>();
		subject.registerObserver(this);
	}
	
	@Override
	public void update(Subject subject) {
		if (subject instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) subject;
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
