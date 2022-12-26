
package mypack;


public class CarExample {
	public static void main(String[] args) {
		//car 객체를 생성
		Car myCar = new Car("제네시스");
		
		//Car 객체의 필드값을 출력
		/*
		System.out.println(myCar.model); 	// null	
		System.out.println(myCar.start); 	// false
		System.out.println(myCar.speed); 	// 0
		*/
		myCar.printCarState();
		//Car 객체의 메서드를 호출
		
		myCar.speedUp();
		/*
		System.out.println(myCar.model); 	// null	
		System.out.println(myCar.start); 	// true
		System.out.println(myCar.speed);	// 1
		*/
		myCar.printCarState();
		
		myCar.speedDown();
		/*
		System.out.println(myCar.model); 	// null	
		System.out.println(myCar.start); 	// false
		System.out.println(myCar.speed);	// 0
		*/
		myCar.printCarState();
	}
}
