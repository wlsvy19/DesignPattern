package adaptertwo190513;

public class Main {
	public static void main(String[] args) {
		//직접호출하지 않는 이유 : 직접 호출이 안되는 경우이거나, 기존에 있는 것을 변화해서 호출해야 하는 경우를
		//생각하면 기존에 있는 Camera를 수정하지 않은 상태에서 interface와 Adapter만 수정하여 Main에서 원하는
		//메소드로 변화시켜 호출 시켜준다??
		Connectable connCam = new AdapterCameraByObject();
		connCam.connectCamA();
		connCam.connectCamB();
	}
}
