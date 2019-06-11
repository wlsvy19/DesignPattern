package weather190502;

import java.util.ArrayList;

public class WeatherData implements Subject {
	// Observer 객체들을 저장하기 위해 ArrayList추가
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		// ArrayList형 observer객체 생성(생성자)
		observers = new ArrayList();
	}

	// 옵저버가 등록하면 목록 맨 뒤에 추가만 하면 된다.
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	// 중요! 상태에 대해서 모든 옵저버들한테 알려주는 메소드
	// 모두 Observer인터페이스를 구현하는, 즉 update()메소드가 있는 객체들이므로 손쉽게 알려줄 수 있다.
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	// 옵저버가 탈퇴를 신청하면 목록에서 뺀다.
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	// 기상 스테이션으로 부터 갱신된 측정치를 받으면 옵저버들한테 알린다.
	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}



}
