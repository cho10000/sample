package sample_ex;

class hello{
	public hello()
	{
		System.out.println("생성자 부분");
	}

	public void prn_1() {
		// TODO Auto-generated method stub
		System.out.println("연습입니다. 생성자 부분");
	}
}

public class my2sample1 {
	public static void main(String[] args) {
	hello myhello = new hello();
	myhello.prn_1();
	
	System.out.println("1+2= //" +  (1+2));
	System.out.println();
}
}
