package Pokemon.superclass;

public abstract class Monster {
	public String name;
	public int hp;
	public int MAXHP;
	public abstract String getName(Monster m);
	public abstract void setHp(int hp) ;
	public abstract int getHp();
	public abstract int getMAXHP(Monster m);
	public abstract void attack(Mymonster mymonster);
	public abstract int getDamage();

}
