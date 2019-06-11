package weather190502;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);//위아래 메소드는 Observer를 인자로 받는다. 옵저버 등록/제거 역할
	public void notifyObservers();//주제 객체의 상태가 변경되었을 때 모든 옵저버들한테 알리기 위한 메소드
}
