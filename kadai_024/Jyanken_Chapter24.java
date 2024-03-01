package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	private HashMap<String, String> jyanken = new HashMap<String, String>();

	public String getmyChoice() {
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

	public void playGame() {
		String hand = getmyChoice();
		String yourHand = getRandom();

		// 入力した内容を出力する
		System.out.println("自分の手は" + (jyanken.get(hand)) + "," + "対戦相手の手は" + jyanken.get(yourHand));

		switch (hand) {
		case "r":
			if (yourHand == "r") {
				System.out.println("あいこです");
			} else if (yourHand == "s") {
				System.out.println("自分の勝ちです");
			} else if (yourHand == "p") {
				System.out.println("自分の負けです");
			}
			break;
		case "s":
			if (yourHand == "s") {
				System.out.println("あいこです");
			} else if (yourHand == "p") {
				System.out.println("自分の勝ちです");
			} else if (yourHand == "r") {
				System.out.println("自分の負けです");
			}
			break;
		case "p":
			if (yourHand == "p") {
				System.out.println("あいこです");
			} else if (yourHand == "p") {
				System.out.println("自分の勝ちです");
			} else if (yourHand == "s") {
				System.out.println("自分の負けです");
			}
			break;

		}
	}
}