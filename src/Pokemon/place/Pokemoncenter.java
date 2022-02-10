package Pokemon.place;

import Pokemon.superclass.Mymonster;

public class Pokemoncenter {
	public String name = "ポケモンセンター";
	public int heal(Mymonster mymonster){
	mymonster.setHp(mymonster.getMAXHP());
	try {
		System.out.println(".");
		Thread.sleep(500);		
		System.out.println(".");
		Thread.sleep(500);	
		System.out.println(".");
		Thread.sleep(500);	
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}	
	System.out.println(mymonster.getName(mymonster)+"のHPが全回復した");
	return 1;

		}
}
