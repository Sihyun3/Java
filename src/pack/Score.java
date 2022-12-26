package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	private String name;
	private int math;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	private int english;
	private int korean;

	public Student(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
}

public class Score {
	private static List<Student> students = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);

	static void input() {
//		boolean isRun = true;
		System.out.println("> 이름, 국어, 영어, 수학 점수를 입력하세요. (입력을 종료하면 Q를 입력하세요.)");
		while (true) {

//			System.out.println(">");
			String input = scan.next();
			if (input.equals("q") || input.equals("Q")) {
				break;
			}
			String[] in = input.split(",");
			String name = in[0];
			int korean = Integer.parseInt(in[1].trim());
			int english = Integer.parseInt(in[2].trim());
			int math = Integer.parseInt(in[3].trim());

			students.add(new Student(name, korean, english, math));

		}
	}

	static void korean() {
		int total = 0;

		for (Student std : students) {
			System.out.println(std.getName() + " " + std.getKorean());
			total = total + std.getKorean();

		}
		double average = total / students.size();
		average = (double) Math.round(average * 100) / 100; // (int) average;

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
	}

	static void English() {
		int total = 0;
		for (Student std : students) {
			System.out.println(std.getName() + " " + std.getEnglish());
			total = total + std.getEnglish();

		}
		double average = total / students.size();
		average = Math.round(average * 100) / 100; // (int) average;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
	}

	static void Math() {
		int total = 0;
		for (Student std : students) {
			System.out.println(std.getName() + " " + std.getMath());
			total = total + std.getMath();

		}
		double average = total / students.size();
		average = Math.round(average * 100) / 100; // (int) average;

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
	}

	public static void main(String[] args) {

		boolean isRun = true;
		while (isRun) {
			System.out.println("--------------------------------------");
			System.out.println("> 1.입력|2.국어|3.영어|4.수학|5.종료");
			System.out.println("--------------------------------------");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				input();
				break;
			case 2:
				korean();
				break;
			case 3:
				English();
				break;
			case 4:
				Math();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				isRun = false;
			}
		}

	}
}
