package adaptertwo190513;

public class AdapterCameraByObject implements Connectable {
	Camera cam = new Camera();

	@Override
	public void connectCamA() {//FTP
		cam.connectCamA();

	}

	@Override
	public void connectCamB() {//SFTP
		cam.connectCamB();

	}
}
