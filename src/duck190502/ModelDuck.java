package duck190502;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehivior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다.");

	}

}
