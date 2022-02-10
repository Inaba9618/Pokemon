package Pokemon.place;

import Pokemon.monster.Frize;
import Pokemon.monster.Kodac;
import Pokemon.monster.Nyoromo;
import Pokemon.monster.Pikachu;
import Pokemon.superclass.Monster;
import Pokemon.superclass.Mymonster;
import Pokemon.superclass.Town;

public class Topofmountain extends Town {
	public String name = "オオヤマの湖";
	
	public Monster apperance(Mymonster mymonster,String protagonist){
    System.out.println(protagonist+"は"+this.name+"を訪れた");	
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
	int AppearanceProbability = new java.util.Random().nextInt(99);
	if (AppearanceProbability >= 95) {
		System.out.println("何も現れなかった");
		return null;
	} 
	else if (AppearanceProbability >= 75) {
		Monster monster = new Nyoromo();
		System.out.println(monster.getName(monster)+"が現れた。"+"HP   "+monster.getHp()+"/"+monster.getMAXHP(monster));
		System.out.println(monster.getName(monster)+"は様子を見ている");
		return monster;
	}
	else if (AppearanceProbability >= 40) {
		Monster monster = new Kodac();
		System.out.println(monster.getName(monster)+"が現れた");
		System.out.println(monster.getName(monster)+"は様子を見ている");
		return monster;
	}
	
	else if (AppearanceProbability >= 20) {
		Monster monster = new Frize();
		System.out.println(monster.getName(monster)+"が現れた");
		System.out.println(monster.getName(monster)+"は様子を見ている");
		return monster;
	}
	
	else if (AppearanceProbability >= 0) {
		Pikachu monster = new Pikachu();
		System.out.println(monster.name+"が現れた");
		System.out.println(monster.name+"は様子を見ている");
		return monster;
	}
	return null;


		}
}
