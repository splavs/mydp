package chapter2.firstimpl;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temp;
	private float humidity;
	private float pressure;
	
	public CurrentConditionDisplay(Subject subject) {
		subject.registerObserver(this);
	}

	
	@Override
	public void update(Subject subject) {
		if (subject instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) subject;
			this.temp = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
		
			this.display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("Temperature = " + temp);
		System.out.println("Humidity = " + humidity);
		System.out.println("Pressure = " + pressure);
		
	}

}
