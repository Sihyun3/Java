package decnine;

public class gugudanExec {
	public static void main(String[] args) {
		gugudan g = new gugudan();
		g.print();
		//g.dan = -2; //  객체의 필드값을 직접 수정하는 것은 올바른 방법은 아님
		g.setDan(2);
		
		gugudan g2= new gugudan();
		g2.print();
		
		gugudan g3= new gugudan(3);
		g3.print();
		
		for(int i = 2; i<10; i++) {
			g.setDan(i);
			g.print();
		}
	}
}
