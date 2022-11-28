package main;

public class Methereologics {
	public EventManager event;
	
	public Methereologics() {
		event = new EventManager();
	}
	
	public void weatherChange(String message) {
		event.notify(new WeatherForecastListener(), message);
	}
	
	public void tempChange(String message) {
		event.notify(new TemperatureForecastListener(), message);
	}
}
