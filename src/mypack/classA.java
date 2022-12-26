package mypack;

public class classA {

	final int CONST_NUM_TEN;
	static final int CONST_NUM_NINE;
	
	
	void changeFinal () {
		// final로 지정된 값은 변경할 수 없음
		// CONST_NUM_TEN = 100;
		// CONST_NUM_NINE = 99;
	}
	
	classA() {
		CONST_NUM_TEN = 10;
		// 생성자에서 static final 상수를 초기화할 수 없음
		// CONST_NUM_NINE = 9;
	}
	
	static {
		// CONST_NUM_TEN = 10;
		CONST_NUM_NINE = 9;
	}

}


