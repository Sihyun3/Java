package mypack;

import java.security.DomainCombiner;

public class Person {
	String name;
	String regno;
	String gender;
	int birthyear;
	int birthmonth;
	int birthday;
	boolean isOlder; // 출생 여부 남자면 true 여자면 false
	int age;

	Person(String name, String regno) {
		this.name = name;
		this.regno = regno;
		String b = this.regno.substring(7, 8);
		int s = Integer.parseInt(b);
		switch (s) {
		case 1:
		case 3:
			this.gender = "남";     //this를 안넣어도 상관없지만 넣는게 좋다.
			break;
		case 2:
		case 4:
			this.gender = "여";
		}
		int x = Integer.parseInt(this.regno.substring(0, 2));
		// 나이
		if (s == 1 || s == 2) {
			this.isOlder = false;
			this.birthyear = 1900 + Integer.parseInt(regno.substring(0, 2));

		}
		if (s == 3 || s == 4) {
			this.birthyear = 2000 + Integer.parseInt(regno.substring(0, 2));
			this.isOlder = true;
		}
		this.birthmonth = Integer.parseInt(regno.substring(2, 4));
		this.birthday = Integer.parseInt(regno.substring(4, 6));
		this.age = 2022 - this.birthyear;

	}
	
	  void printPersonInfo() {
		
		
		System.out.println(">>> 이름 :" + this.name);
		System.out.println(">>> 주민번호 : " + this.regno);
		System.out.println(">>> 성별 : " + this.gender);
		System.out.println(">>> 나이 : 만 " + this.age);
		System.out.println(">>> 생년월일 : " + this.birthyear+"년" + this.birthmonth +"월"+ this.birthday+"일");
		System.out.printf(">>> 2000년 %s 출생", this.isOlder ? "이전" : "이후");
		
	
	}

		
	
}
