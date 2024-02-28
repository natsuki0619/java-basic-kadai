package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	    private HashMap<String, String> jyanken;
		public String getmyHand() {
		
		// Scannerクラスのオブジェクトを取得する
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
	    String[] hand = new String[3];
		
		// 入力した内容を取得する
		hand[0] = "r";
		hand[1] = "s";
		hand[2] = "p";
		
        for(int i = 0; i < hand.length; i++) {
        	if(input.equals(hand[i])) {
        		
       	 } else {
    		System.out.println("正しいじゃんけんの手ではありません");	
       	 };
         
       	 scanner.close();
	    }
		 return input;
	    }
		 public String getRandom() {
			String[] yourHand = new String[3];
			
			yourHand[0] = "r";
			yourHand[1] = "s";
			yourHand[2] = "p";
			
	        double yourChoice = Math.random() * 2;
	        int yourChoiceFloor = (int)( Math.floor(yourChoice));
					
	        return yourHand[yourChoiceFloor];
	     }
			
		 public void jyanken() {
			HashMap<String,String> jyanken = new HashMap<String,String>();
			
			jyanken.put("r","グー");
			jyanken.put("s","チョキ");
			jyanken.put("p","パー");
			
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
		 }
			public void game(String getmyHand, String getRandom) {
				String hand = getmyHand();
				String yourHand = getRandom();
			
		    // 入力した内容を出力する
		    System.out.println("自分の手は" + (jyanken.get(hand)) + "," + "対戦相手の手は" + jyanken.get(yourHand));
		    
		    if(this.getmyHand() == "r") {
		    	switch(this.getRandom()) {
		    	case "r":
		    	    System.out.println("あいこです");
		    	case "s":
		    		System.out.println("自分の勝ちです");
		    	case "p":
		    		System.out.println("自分の負けです");
				default:
					break;		
		    };
		   
		    } else if(this.getmyHand() == "s") {
		    	 switch(this.getRandom()) {
	    	    case "r":
	    	        System.out.println("あいこです");
	    	    case "s":
	    		    System.out.println("自分の勝ちです");
	    	    case "p":
	    		    System.out.println("自分の負けです");
				default:
					break;
		    };
	    		
		    } else if(this.getmyHand() == "s") {
				   switch(this.getRandom()) {
			     case "r":
			    	  System.out.println("あいこです");
			     case "s":
			          System.out.println("自分の勝ちです");
			     case "p":
			    	  System.out.println("自分の負けです");
				default:
					break;
			};
			
		    }
      }
}