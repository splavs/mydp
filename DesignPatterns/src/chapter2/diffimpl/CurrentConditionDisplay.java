package chapter2.diffimpl;

import java.util.*;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private Observable observable;
	private float temp;
	private float humidity;
	private float pressure;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	
	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) { 
			this.temp = ((WeatherData)observable).getTemperature();
			this.humidity = ((WeatherData)observable).getHumidity();
			this.pressure = ((WeatherData)observable).getPressure();
		}
		this.display();
	}
	
	@Override
	public void display() {
		System.out.println("Temperature = " + temp);
		System.out.println("Humidity = " + humidity);
		System.out.println("Pressure = " + pressure);
		
	}

}
