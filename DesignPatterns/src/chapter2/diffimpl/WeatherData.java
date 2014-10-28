/**
 * 
 */
package chapter2.diffimpl;

import java.util.*;

/**
 * @author Vyacheslav Silchenko
 *
 */
public class WeatherData extends Observable {
	
	private float temp;
	private float humidity;
	private float pressure;
	
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
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurment(float temp, float pressure, float humidity) {
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		
		measurmentChanged();
	}

}
