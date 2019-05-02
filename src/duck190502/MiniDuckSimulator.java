package duck190502;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		System.out.println("-------------------------");
		Duck model = new ModelDuck();
		model.performFly();
		//못날다가 나네??
		//실행중에 오리의 행동을 바꾸고 싶으면 원하는 행동에 해당하는 Duck의 세터 메소드를 호출하기만 하면 된다.
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
