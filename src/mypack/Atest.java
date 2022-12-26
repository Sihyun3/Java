package mypack;

public class Atest {
	public static void main(String[] args) {
		// A 클래스의 인스턴스를 생성
		A a = new A(); // 아마 이걸 써야 a에 있는걸 뽑아 쓸수 있는거 같다.
		
		// 필드 값 출력
		System.out.println(a.m);
		System.out.println(a.n);
		
		//메서드를 호출
		a.work1();
		a.work2(10);
		System.out.println("가나다");
	}
}
