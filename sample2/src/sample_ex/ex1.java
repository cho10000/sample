package sample_ex;

import java.util.ArrayList;
import java.util.List;
//조심하라는 것
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("박지성");
		arrList.add("손홍민");
		arrList.add("기성용");
		
		for (int i=0; i<arrList.size();  i++) {
			System.out.println("arrList : " + arrList.get(i));
		}

		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(123);
		alist.add(456);
		alist.add(789);
		for (int i=0; i<alist.size();  i++) {
			System.out.println("arrList : " + alist.get(i));
		}
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(456);
		list.add(789);
		for (int i=0; i<list.size();  i++) {
			System.out.println("List : " + list.get(i));
		}
		
		
		
	}

}
