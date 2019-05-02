package duck190502;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehivior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("저는 물오리입니다.");
	}

}
