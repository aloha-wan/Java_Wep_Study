package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 하위 메소드가 재 정의해서 사용하는 것.
	public void washCar() {}
	
	// final는 재정의 할 수 없는 메소드
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
