package Strategy190604;

public class Client {
	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");

		//수정된 부분: 전략 변경 방법
		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());

		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());

		System.out.println("나의 이름은 " + taekwonV.getName() + " 이야!");
		taekwonV.move();
		taekwonV.attack();

		System.out.println("--------------------------------------------");
		System.out.println("내 이름은!" + atom.getName() + " 이지!");
		atom.move();
		atom.attack();
	}
}
