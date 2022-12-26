package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		// 단어장 생성
		final String STATEMENT = "The best of the BBC, with the latest news and sport headlines, weather, highlights and much more from across the whole of BBC Online."
				.replaceAll(",", "").replaceAll("\\.", "");
		String[] words = STATEMENT.split(" ");

		// 단어장에서 임의의 단어를 추출
		// Math.random() * (max - min + 1) + min
		int randNum = (int) (Math.random() * words.length);
		String word = words[randNum];

		/*
		// 단어의 자릿수를 표시
		for (int i = 0; i < word.length(); i++) {
			System.out.print("_");
		}
		*/
		int length = word.length(); // 단어 길이
		// 단어를 쪼가리 내는거
		String[] alp = new String[length]; // 단어가 조각나서 들어갈 자리
		for (int x = 1; x - 1 < word.length(); x++) {
			alp [x-1] =  word.substring((length -length +x -1 ), (length-length +x )); // 이거만 집어 넣으면 완성인데
		}
		String[] display = new String[length]; 
		// 디스플레이 보여주는거
		for(int y = 1; y - 1 < word.length(); y++) {
			display [y-1] = "_";
		}
		System.out.println(Arrays.toString(display));
		int count = 0;
		while (true) {
			
			
			if(count == length) {
				System.out.println("맞췄습니다.");
				break;
			}
			System.out.println("시스템이 추출한 단어를 맞춰 보세요.");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			for (int i = 0; i < word.length(); i++) {

				if (alp[i].equals(input)) {
					display[i] = alp [i];
					count++;
				}
				
			}
			System.out.println(Arrays.toString(display));
		
		}
	
}
	
}
