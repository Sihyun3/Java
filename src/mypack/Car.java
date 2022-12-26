
package mypack;


public class Car {
	// 필드
	String model;
	boolean start;
	int speed;
	
	//생성자
	Car(String model) {
		this.model = model;
		this.start = false;
		this.speed = 0;
	}
	
	// 메서드
	void speedUp() {
		speed ++;
		
		if (speed > 0) {
			start = true;
		}
	}
	void speedDown() {
		speed --;
		if (speed <= 0) {
			start = false;
		}
	}
	
	void printCarState() {
		System.out.printf("모델 %s는 속도 %d로 %s 상태입니다.\n", model,speed,start ? "출발" : "정지");
	
	}
}

