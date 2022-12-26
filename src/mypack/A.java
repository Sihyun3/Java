package mypack;

public class A {
	
	public static void main(String[] args) {
		System.out.println("     가");
	}
	//필드
	int m = 3;
	int n = 4;
	
	//메서드
	void work1() {
		int k = 5;					// work1 메서드의 지역변수
		System.out.println(m + n);  // 필드 값은 클래스 내부에서 사용이 가능
		System.out.println(k);		//지역변수 k 는 work1에서만 사용가능
		work2(3);					// 매개 변수의 값은 해당 메서드를 호출하는 쪽에서 설정
		}
	
	void work2(int i) {				//매개 변수 i도 work2 메서드의 지역 변수
		int j = 4;					// work2의 지역변수
		System.out.println(m + n); 
		System.out.println(i + j);
		// System.out.println(k);   work1의 지역 변수는 work1 외부에서는 사용이 불가능
		
	}


}
