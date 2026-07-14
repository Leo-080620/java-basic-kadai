package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		// 辞書クラスのインスタンス作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 調べる単語を配列にセット
		String[] words = {
				"apple",
				"banana",
				"grape",
				"orange"
		};
		
		// 辞書検索
		dictionary.serch(words);
	}

}
