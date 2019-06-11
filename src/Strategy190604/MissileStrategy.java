package Strategy190604;

public class MissileStrategy implements AttackStrategy {
	@Override
	public void attack() {
		System.out.println("나는 미사일을 가졌다!");
	}
}