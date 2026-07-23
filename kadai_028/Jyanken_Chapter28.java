package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	// 自分の手を入力する
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String myChoice = scanner.next();
			
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				return myChoice;
			}
			
			System.out.println("エラー：r・s・p のいずれかを入力してください。");
		}
	}
	
	
	// 相手の手をランダムで決める
	public String getRandom() {
		
		String[] hands = {"r", "s", "p"};
		
		int random = (int) Math.floor(Math.random() * 3);
		
		return hands[random];
	}
	
	// じゃんけんを行う
	public void playGame(String myChoice, String enemyChoice) {
		
		HashMap<String, String> handMap = new HashMap<>();
		
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		System.out.println("自分の手は" + handMap.get(myChoice) + "，対戦相手の手は" + handMap.get(enemyChoice));
		
		if (myChoice.equals(enemyChoice)) {
			System.out.println("あいこです");
			
		} else if ((myChoice.equals("r") && enemyChoice.equals("s"))
				|| (myChoice.equals("s") && enemyChoice.equals("p"))
				|| (myChoice.equals("p") && enemyChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
			
		} else {
			System.out.println("自分の負けです");
			
		}
	}
}
