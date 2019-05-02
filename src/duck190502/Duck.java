package duck190502;

public abstract class Duck {
	FlyBehavior flyBehivior;
	QuackBehavior quackBehavior;

	public Duck() {

	}

	public abstract void display();

	public void performFly() {
		flyBehivior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("모든 우리는 물에 뜬다. 가짜 오리조차도 뜨지");
	}

	//오리의 행동을 동적(즉석)으로 바꾸기 위한 메소드
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehivior = fb;
	}
	//오리의 행동을 동적(즉석)으로 바꾸기 위한 메소드
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}


}
