package mypack;

import java.util.Scanner;

public class PersonExec {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("주민번호 : ");
		String regno = scan.nextLine();
		
		Person p = new Person(name, regno);
		p.printPersonInfo();
		
		scan.close();		

	}
		
		
	}

