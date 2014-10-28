/**
 * 
 */
package chapter2.firstimpl;

import java.util.*;

/**
 * @author Vyacheslav Silchenko
 *
 */
public class WeatherData implements Subject {
	private List<Observer> observers;
	
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public boolean registerObserver(Observer observer) {
		return observers.add(observer);
	}
	
	@Override
	public boolean removeObserver(Observer observer) {
		return observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this);
		}
	}
	
	public float getTemperature() {
		return temp;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public void measurmentChanged() {
		notifyObservers();
	}
	
	public void setMeasurment(float temp, float pressure, float humidity) {
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		
		measurmentChanged();
	}

}
