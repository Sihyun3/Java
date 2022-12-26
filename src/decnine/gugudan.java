package decnine;

public class gugudan {
	
	private int dan;
	gugudan(){
		this.dan =2;
	}
	gugudan(int dan){
		this.dan = dan;
	}
	
	void setDan(int dan) {
		this.dan= dan;
	}
	void print() {
	System.out.println("===================");
	System.out.println(this.dan + "단");
	System.out.println("===================");
		for(int i = 1; i<10 ; i++) {
			System.out.printf("%d * %d = %2d\n", dan , i ,dan *i);
		}
	}
}
