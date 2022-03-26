package sample_ex;


class CalculatorRedefine {
   int result = 0;

   int add(int num) {
        result += num;
        return result;
    }
   
   int sub(int num) {
       result -= num;
       return result;
   }
}

public class sample02_class {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorRedefine cal1 = new CalculatorRedefine();  // 계산기1 객체를 생성한다.
		CalculatorRedefine cal2 = new CalculatorRedefine();  // 계산기2 객체를 생성한다.

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
	}

}
