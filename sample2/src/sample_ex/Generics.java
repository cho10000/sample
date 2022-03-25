package sample_ex;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Sports> arrList = new ArrayList<Sports>(); arrList.add(new
		 * Sports()); arrList.add(new Soccer()); arrList.add(new Baseball());
		 * 
		 * Sports sports = arrList.get(0); Soccer soccer = (Soccer) arrList.get(1);
		 * 
		 * }
		 */
		Player<Soccer, String> player = new Player<Soccer, String>(new Soccer("ManUdd"), "JSPark");
		System.out.println();
	
	}
}

class Sports {

}

class Soccer extends Sports {
	public String team;

	Soccer(String team) {
		this.team = team;

		System.out.println(team );	
	}
	
}

class Player<T, S> {
	public T team;
	public S name;

	Player(T team, S name) {
		this.team = team;
		this.name = name;
	
	
	}

}

class Baseball extends Sports {
}
