package mypack;


public class 가나다라 {
	
	int m;
	int n;
	
	가나다라() {
		m = 10;
		n = 20;
		System.out.println("첫번째 생성자");
	}
		
	가나다라(int a) {
		// Test();	// 생성자 내부에서 생성자를 직접 호출할 수 없음
		this();
		m = a;
		System.out.println("두번째 생성자");
	}
	
	void print() {
		System.out.println("첫번째 프린터");
	}
	
	void print(int a) {
		print();	// 메서드 내부에서 오버로딩된 메서드를 직접 호출할 수 있음
		System.out.println("두번째 프린터");
	}
	
	public static void main(String[] args) {
		가나다라 t = new 가나다라(100);
		System.out.println("m = " + t.m);	// 100
		System.out.println("n = " + t.n);	// 20
		
		t.print(100);
	}	
	
}

