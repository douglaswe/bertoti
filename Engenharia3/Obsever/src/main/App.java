package main;

public class App {
	public static void main(String[] args) {
		Methereologics weather = new Methereologics();
		
		weather.event.subscribe(new WeatherForecastListener());
		weather.event.subscribe(new WeatherForecastListener());
		weather.event.subscribe(new TemperatureForecastListener());
		
		weather.tempChange("32°C");
		weather.weatherChange("Heavy rain");
		weather.tempChange("20°C");
	}
}
