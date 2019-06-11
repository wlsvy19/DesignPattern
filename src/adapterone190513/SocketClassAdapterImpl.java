package adapterone190513;

//자바는 다중상속을 허용하지 않으므로 extends와 implements를 동시에 사용함으로써 다중 상속 흉내를 냈다.
//socket을 확장함으로써 socket의 메소드를 별도의 인스턴스 생성 없이 사용할 수 있다.
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return null;
	}

	public Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);

	}
}
