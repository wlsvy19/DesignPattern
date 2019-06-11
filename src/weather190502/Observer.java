package weather190502;

public interface Observer {
	//기상 정보가 변경되었을때 옵저버 한테 전달되는 상태 값
	//이 인터페이스는 모든 옵저버 클래스에서 구현해야 한다.
	//모든 옵저버는 update()메소드를 구현해야 한다.
	public void update(float temp, float humidity, float pressure);
}
