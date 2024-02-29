package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	private HashMap<String, String> jyanken = new HashMap<String, String>();

	public String getmyHand() {
		// Scannerクラスのオブジェクトを取得する
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] hand = { "r", "s", "p" };

		for (int i = 0; i < hand.length; i++) {
			if (input.equals(hand[i])) {
				return input;
			}
		}

		scanner.close(); // リソースリークするのでtry-finallyで書き直したい
		System.out.println("正しいじゃんけんの手ではありません");

		return input;
	}

	public String getRandom() {
		String[] yourHand = { "r", "s", "p" };
		double yourChoice = Math.random() * 3;
		int yourChoiceFloor = (int) (Math.floor(yourChoice));

		return yourHand[yourChoiceFloor];
	}

	public void jyanken() {
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	}

	public void game() {
		String hand = getmyHand();
		String yourHand = getRandom();

		// 入力した内容を出力する
		System.out.println("自分の手は" + (jyanken.get(yourHand)) + "," + "対戦相手の手は" + jyanken.get(hand));

		var result = "";
		switch (yourHand = "r") {
		case "r":
			result = "あいこです";
			break;
		case "s":
			result = "自分の勝ちです";
			break;
		case "p":
			result = "自分の負けです";
			break;
		default:
			break;
		}
		switch (yourHand = "s") {
		case "r":
			result = "あいこです";
			break;
		case "s":
			result = "自分の勝ちです";
			break;
		case "p":
			result = "自分の負けです";
			break;
		default:
			break;
		}
		switch (yourHand = "p") {
		case "r":
			result = "あいこです";
			break;
		case "s":
			result = "自分の勝ちです";
			break;
		case "p":
			result = "自分の負けです";
			break;
		default:
			break;
		}

		System.out.println(result);
	}
}
