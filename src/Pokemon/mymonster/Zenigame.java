package Pokemon.mymonster;

import Pokemon.pokemozukan.Pokemonzukan;
import Pokemon.superclass.Monster;
import Pokemon.superclass.Mymonster;

public class Zenigame extends Mymonster{
	public String name = "ゼニガメ";
	
	public int hp =100;
	public final int MAXHP = 100;
	public int Attackpoint = 20;
	public int Getratio =0;
	
	public String getName(Mymonster mymonster) {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	public int getMAXHP(){
		return this.MAXHP;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackpoint() {
		return this.Attackpoint;
	}
	
	public boolean monsterBall(Monster m,String protagonist) {
		System.out.println(protagonist+"はモンスターボールを投げた");
		try {
			System.out.println(".");
			Thread.sleep(1000);		
			System.out.println(".");
			Thread.sleep(1000);	
			System.out.println(".");
			Thread.sleep(1000);	
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}	
		int getProbability = new java.util.Random().nextInt(99)+Getratio;
		if (getProbability >= 70 ) {
			System.out.println(m.getName(m)+"を捕まえた");
			System.out.println(m.getName(m)+"ゲットだぜ!!");
			Pokemonzukan.writePokemonzukan(m);
			Pokemonzukan.lookPokemonzukan();
			return true;
		} 
		else if (getProbability >= 0) {
			System.out.println("惜しい!"+m.getName(m)+"を捕まえられなかった");
			return false;
		}
		return false;
		}
	
	public void attack(Monster m) {
		System.out.println(this.name+"の攻撃");
		m.setHp(m.getHp() -Attackpoint);
		if (m.getHp() <= 0) {
			m.setHp(0);
		}
		System.out.println(m.getName(m)+"に"+Attackpoint+"のダメージを与えた");
		System.out.println("現在の"+m.getName(m)+"のHP   "+m.getHp()+"/"+m.getMAXHP(m));
		if (m.getHp()==0) {
			System.out.println(m.getName(m)+"を倒した");
		}
		}
	
	public void close(Monster m) {
		System.out.println(m.getName(m)+"に近づいた");
		Getratio += 20;
		System.out.println(m.getName(m)+"を捕まえられる可能性が20%上がった");
	}
	
	public void runAway(String protagonist) {
		System.out.println(protagonist + "と"+this.name+"は戦闘から逃げ出した");
		
		}
	
}