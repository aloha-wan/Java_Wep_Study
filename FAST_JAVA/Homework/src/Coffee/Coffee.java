package Coffee;

class Create{
	public void create() {
		System.out.println("커피 만들기 시작");
	}
}

class BoilWater extends Create{
	public void boilWater() {
		System.out.println("물 끓인다.");
	}
	
}

class Brew extends Create{

	public void brew() {
		System.out.println("커피 끓이다.");
	}
}

class PourInCup extends Create{

	public void pourInCup() {
		System.out.println("컵에 붓는다.");
	}
}


public class Coffee {

	public static void main(String[] args) {
		Create create = new Create();
	}
	
}
