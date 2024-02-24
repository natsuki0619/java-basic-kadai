package kadai_014;

public class Car_Chapter14 {
	
	    // フィールド
	    private int  gear = 1;
	    private int speed = 10;
	    private int previousGear =1;

		
		public Car_Chapter14(int gear, int speed) {
			this.gear = gear;
			this.speed = speed;
		}
		
	    public int getSpeed() {
	        return this.speed;
	    }
	    // メソッド（ギア、速度）	
	    public void gearChange (int afterGear) {
		gear = afterGear;
		speed = switch(gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
	};
	
	   System.out.println("ギア" + this.previousGear + "から" + afterGear + "に切り替えました");
	   System.out.println("速度は" + getSpeed() + "kmです");
	}
	
	   public void run() {
		System.out.println("");
	}
	
}
	

