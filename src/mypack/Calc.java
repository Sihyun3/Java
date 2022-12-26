package mypack;

public class Calc {

	public static void main(String[] args) {
		final String STATEMENT = "The best of the BBC, with the latest news and sport headlines, weather, highlights and much more from across the whole of BBC Online."
				.replaceAll(",", "").replaceAll("\\.", "");
		String[] words = STATEMENT.split(" ");

		// 단어장에서 임의의 단어를 추출
		// Math.random() * (max - min + 1) + min
		int randNum = (int) (Math.random() * words.length);
		String word = words[randNum];

		// 단어의 자릿수를 표시
		for (int i = 0; i < word.length(); i++) {
			System.out.print("_");
		}
		int length = word.length(); // 단어 길이
		String[] alp = new String[length]; // 단어가 조각나서 들어갈 자리
		
		alp [length] = word.substring((2), (3));
		alp [] = word.substring((0), (1));
		alp [] = word.substring((1), (2));// 이거만 집어 넣으면 완성인데
		System.out.println(alp[1]);
		}
		
	}

//for (int x = 1; x - 1 < word.length(); x++) {