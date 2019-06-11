package Strategy190604;

public abstract class Robot {
	private String name;
	private AttackStrategy attackStrategy;
	private MovingStrategy movingStrategy;

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// 전략적 방법 쓰자.
	public void attack() {
		attackStrategy.attack();
	}

	public void move() {
		movingStrategy.move();
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public void setName(String name) {
		this.name = name;
	}

}
