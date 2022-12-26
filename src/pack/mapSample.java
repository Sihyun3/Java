package pack;

import java.util.HashMap;
import java.util.Map;

public class mapSample {
	public static void main(String[] args) {
		
	
	Map<Integer,String> hm = new HashMap();
	
	hm.put(1, "가나다");
	hm.put(2, "라마바");
	System.out.println(hm.toString());
	
	hm.put(1,"ABC");
	System.out.println(hm.toString());
	
	String s = hm.replace(1, "XYZ");
	boolean b = hm.replace(2,"라마바","asd");
	System.out.println(hm.toString());
	System.out.println(s);	//변경 전의 값
	System.out.println(b);	//true
	
	hm.remove(1);
	System.out.println(hm.toString());
	}

}
	

