package kadai_014;

public class CarExec_Chapter14 {
	public static void main(String[] args) {
		
		// コンストラクタ
		Car_Chapter14 cargear = new Car_Chapter14(1,30);
		Car_Chapter14 carspeed = new Car_Chapter14(1,30);
		
		// ギアチェンジ
		cargear.gearChange(3);
		carspeed.run();

	}

}
