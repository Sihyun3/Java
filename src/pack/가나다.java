package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Fruit{
	private String name;
	private int count;
	
	public Fruit(String name, int count) {
		super();
		this.name = name;
		this.count = count;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}

public class 가나다 {
	static Scanner scan = new Scanner(System.in);
	
	private static List<Fruit> fruits = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("지금 까지 먹었던 과일을 입력하세요");
		String input = scan.nextLine().trim();
		String[] values =input.split(" ") ;
		System.out.println(Arrays.toString(values));
		for(String value : values) {
			boolean isRegisted = false;
			for(Fruit fruit : fruits) {
				if (value.equals(fruit.getName())) {
					isRegisted = true;
					fruit.setCount(fruit.getCount() +1);
					break;
				}
			
			}
			if(!isRegisted) {
				fruits.add(new Fruit(value , 1));
			}
		}
		System.out.printf("지금까지 먹었던 과일은 총 %d가지 종류이고 각 과일의 섭취 횟수는 다음과 같습니다.",fruits.size());
		
		for(Fruit fruit : fruits) {
			System.out.printf("- %s : %d\n",fruit.getName(),fruit.getCount());
		}
	}
}
