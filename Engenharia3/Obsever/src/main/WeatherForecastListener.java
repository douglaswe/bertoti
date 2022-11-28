package main;

public class WeatherForecastListener implements EventListener {
	
	public WeatherForecastListener() {
		
	}
	
	public void update(String message) {
		System.out.println(message + " |> from WeatherForecast");
	}
}
