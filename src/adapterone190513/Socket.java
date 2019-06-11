package adapterone190513;
//volt와 socket 클래스를 만들었다. socket 클래스에서는 120v만 얻을 수 있다.
//실생활을 예로 ㄷ르자면 120v로 부터 12v와 3v도 얻고 싶다면 어뎁터를 끼움으로서 volt를 변환할 수 있다.
//Protocol로부터 FTP와 SFTP를 얻고 싶다면 어뎁터를 끼움으로써 -> Protocol을 변환할 수 있다.

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
