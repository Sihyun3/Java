package mypack;


public class 쓰레기통 {
	
	// 	필드가 기본 값으로 1, 2, 3, 4를 가지고, 
	// 	생성자를 통해서 설정하면 설정된 값만 변경되기를 희망
	int m;
	int n;
	int x;
	int y;
	
	쓰레기통() {
		this.m = 1;
		this.n = 2;
		this.x = 3;
		this.y = 4;
	}
	
	쓰레기통(int m) {
//		this.m = m;
//		this.n = 2;
//		this.x = 3;
//		this.y = 4;
		
		this();
		this.m = m;
	}
	
	쓰레기통(int m, int n) {
//		this.m = m;
//		this.n = n;
//		this.x = 3;
//		this.y = 4;
		
//		this();
//		this.m = m;
//		this.n = n;
		
		this(m);
		this.n = n;
	}
	
	쓰레기통(int m, int n, int x) {
//		this.m = m;
//		this.n = n;
//		this.x = x;
//		this.y = 4;
		
		this(m, n);
		this.x = x;
	}
	
	쓰레기통(int m, int n, int x, int y) {
//		this.m = m;
//		this.n = n;
//		this.x = x;
//		this.y = y;
		
		this(m, n, x);
		this.y = y;
	}
	
	public static void main(String[] args) {
		쓰레기통 t1 = new 쓰레기통();
		System.out.printf("%d\t%d\t%d\t%d\n", t1.m, t1.n, t1.x, t1.y);
		
		쓰레기통 t2 = new 쓰레기통(10);
		System.out.printf("%d\t%d\t%d\t%d\n", t2.m, t2.n, t2.x, t2.y);
		
		쓰레기통 t3 = new 쓰레기통(10, 20);
		System.out.printf("%d\t%d\t%d\t%d\n", t3.m, t3.n, t3.x, t3.y);

		쓰레기통 t4 = new 쓰레기통(10, 20, 30);
		System.out.printf("%d\t%d\t%d\t%d\n", t4.m, t4.n, t4.x, t4.y);

		쓰레기통 t5 = new 쓰레기통(10, 20, 30, 40);
		System.out.printf("%d\t%d\t%d\t%d\n", t5.m, t5.n, t5.x, t5.y);
	}	
	
}


