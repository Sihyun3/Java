package mypack;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 여기 systems s지워야해요 m e뒤에 S대문자

		System.out.println("사용자의 이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("주민 등록 번호를 입력하세요.");
		String a = scan.nextLine();
		String id = a.trim();
		int now_year = 22;

		String gender = "";
		String b = id.substring(7, 8);
		int s = Integer.parseInt(b);
		switch (s) {
		case 1:
		case 3:
			gender = "남";
			break;
		case 2:
		case 4:
			gender = "여";
		}
		//String year = id.substring(0, 2);
		//int x = Integer.parseInt(year);
		int x = Integer.parseInt(id.substring(0,2));
		int age = 0;
		// 나이         
		if (s == 1 || s == 2) {

			age = now_year - x + 100;
		}
		if (s == 3 || s == 4) {
			age = now_year - x;
		}
		//System.out.println(name + "(" + id + ")    " + "성별 :" + gender + "      나이 만" + age + "세");
		
		System.out.printf("이름 : %s 주민번호 : %s  성별 : %s 나이 :  만 %d 세", name, id , gender, age);
	}
}
