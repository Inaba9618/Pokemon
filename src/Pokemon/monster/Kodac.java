package Pokemon.monster;

import Pokemon.superclass.Monster;
import Pokemon.superclass.Mymonster;

public class Kodac extends Monster {
	public String name = "コダック";
	public int hp =40;
	public int MAXHP =40;
	public int damage = 10;
	public int getHp() {
		return this.hp;
	}
	public int getMAXHP(Monster m){
		return this.MAXHP;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return this.damage;
	}
	
	public void attack(Mymonster mymonster) {
		System.out.println(this.name+"の攻撃");
		System.out.println(mymonster.getName(mymonster)+"に"+damage+"のダメージ");
		mymonster.setHp(mymonster.getHp() - damage);
		if (mymonster.getHp() <= 0) {
			mymonster.setHp(0);
		}
		System.out.println("現在の"+mymonster.getName(mymonster)+"のHP   "+mymonster.getHp()+"/"+mymonster.getMAXHP());
	}
	public String getName(Monster m) {
		return this.name;
	}

}
