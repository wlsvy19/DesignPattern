package weather190502;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

		//새로운 기상 측정값이 들어온 것처럼 만든다.
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 92, 29.2f);

	}
}
