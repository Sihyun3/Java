
package mypack;

class Apple {}
class Pencil {}

class Goods {
	private Object goods = new Object();

	public Object getGoods() {
		return goods;
	}

	public void setGoods(Object goods) {
		this.goods = goods;
	}	
}

public class rkskek {
	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setGoods(new Apple());			//이게 상속인건가
		
		Apple apple = (Apple) goods.getGoods();  //이게 상속도 안받았는데 머지
		
		// java.lang.ClassCastException: class test.Apple cannot be cast to class test.Pencil
		// 약한 타입 체크(week type checking) => 실행 시점에 문제를 확인할 수 있음
		//Pencil pencil = (Pencil) goods.getGoods();	//이건 머지
	}

}