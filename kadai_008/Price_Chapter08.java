package kadai_008;

public class Price_Chapter08 {
	public static void main(String[] args) {
		
		int agePraice = 30
				;
		String price = "";
		
		price = switch(agePraice) {
		case 10 -> "1000";
		case 20 -> "2000";
		case 30 -> "3000";
		case 40 -> "3000";
		case 50 -> "4000";
		default -> "500";
		};
		
		System.out.println(agePraice + "代の料金は" + price +"円");
		
	}

}
