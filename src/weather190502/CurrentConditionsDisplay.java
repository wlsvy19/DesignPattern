package weather190502;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;

	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	//가장 최근에 얻은 기온과 습도 출력
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degree and" + humidity + "% humidity");
	}
}
