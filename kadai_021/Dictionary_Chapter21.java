package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	// 辞書作成
	HashMap<String, String> dictionary = new HashMap<>();
	
	// コンストラクタ
	public Dictionary_Chapter21() {
		
		// 辞書へ登録
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	// 辞書を調べるメソッド
	public void serch(String[] words) {
		for(String word : words) {
			if(dictionary.get(word) != null) {
				System.out.println(word + "の意味は" + dictionary.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}
