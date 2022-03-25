package sample_ex;

public class Hero_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero[] heros = new Hero[3];

		heros[0] = new Warrier("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Wizard("마법사");

		for (int i = 0; i < heros.length; i++) {
			heros[i].attack();

			if (heros[i] instanceof Warrier) {
				Warrier temp = (Warrier) heros[i];
				temp.groundCutting();
			} else if (heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.FireArrow();
			} else if (heros[i] instanceof Wizard) {
				Wizard temp = (Wizard) heros[i];
				temp.freeze();
			}
		}
		
		int i;
		i=50;
		double d= 50.0;
		i=(int) d;
		System.out.println(30 * d);
		System.out.println(i);

	}

}
