package Pokemon.place;

import Pokemon.monster.Frize;
import Pokemon.monster.Kodac;
import Pokemon.monster.Nyoromo;
import Pokemon.monster.Pikachu;
import Pokemon.superclass.Monster;
import Pokemon.superclass.Mymonster;
import Pokemon.superclass.Town;

public class Lake extends Town {
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
	if (AppearanceProbability >= 65) {
		System.out.println("何も現れなかった");
		return null;
	} 
	else if (AppearanceProbability >= 45) {
		Monster monster = new Nyoromo();
		System.out.println(monster.getName(monster)+"が現れた。"+"HP "+monster.getHp()+"/"+monster.getMAXHP(monster)+ "  攻撃力 "+ monster.getDamage());
		System.out.println(monster.getName(monster)+"は様子を見ている");
		return monster;
	}
	else if (AppearanceProbability >= 20) {
		Monster monster = new Kodac();
		System.out.println(monster.getName(monster)+"が現れた。"+"HP "+monster.getHp()+"/"+monster.getMAXHP(monster)+ "  攻撃力 "+ monster.getDamage());
		System.out.println(monster.getName(monster)+"は様子を見ている");
		return monster;
	}
	
	else if (AppearanceProbability >= 5) {
		Monster monster = new Frize();
		System.out.println(monster.getName(monster)+"が現れた。"+"HP "+monster.getHp()+"/"+monster.getMAXHP(monster)+ "  攻撃力 "+ monster.getDamage());
		System.out.println(monster.getName(monster)+"は様子を見ている");
		System.out.println("伝説のポケモンだ！！");
		return monster;
	}
	
	else if (AppearanceProbability >= 0) {
		Pikachu monster = new Pikachu();
		System.out.println(monster.getName(monster)+"が現れた。"+"HP "+monster.getHp()+"/"+monster.getMAXHP(monster)+ "  攻撃力 "+ monster.getDamage());
		System.out.println(monster.getName(monster)+"は様子を見ている");
		System.out.println("ついにピカチュウが現れた!!");
		return monster;
	}
	return null;


		}
}
