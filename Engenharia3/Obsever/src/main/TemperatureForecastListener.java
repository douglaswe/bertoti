package main;

public class TemperatureForecastListener implements EventListener {
	public void update(String message) {
		System.out.println(message + " |> from TemperatureForecast");
	}
}
