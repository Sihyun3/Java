package decnine;

public class 쓰레기통 {
	String name;                
	
	쓰레기통(String name) {                    //⇐ 해당 클래스에 개발자가 정의한 생성자가 존재
		this.name = name;
	}
	
	void hello() {
		System.out.println("HELLO " + this.name);
	}
}
class 쓰레기장{
	
}
