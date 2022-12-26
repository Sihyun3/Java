package mypack;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		int computernumber = (int) (Math.random() * 100);
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int fin = 0;
		char grd = 0;
		while (fin < 1) {
			System.out.println("값을 입력하시오");
			int input = scan.nextInt();
			if (computernumber != input) {

				if (computernumber < input) {
					System.out.println("입력한 수보다 작습니다");
					count = count + 1;
				} else if (computernumber > input) {
					System.out.println("입력한 수보다 큽니다");
					count = count + 1;
				}
			}

			else if (computernumber == input) {   // else if 자리에 그냥 if 넣어도 상관없는거 같다
				

				switch (count) {
				case 1:
				case 2:
				case 3:
					grd = 'a';
					fin = fin + 1;
					break;
				case 4:
				case 5:
					grd = 'b';
					fin = fin + 1;
					break;
				default:
					grd = 'c';
					fin = fin + 1;
				}
			}
		}
		System.out.println(count + "번 만에 맞췄습니다" + grd + "등급 입니다");
		scan.close();

	}

}
