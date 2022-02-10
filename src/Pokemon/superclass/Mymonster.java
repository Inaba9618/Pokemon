package Pokemon.superclass;

public abstract class Mymonster {
	public String name;
	
	public int hp;
	public int MAXHP;
	public int Attackpoint;
	public int Getratio;
	
	
	public abstract boolean monsterBall(Monster m,String protagonist);
	public abstract void attack(Monster m) ;
	public abstract void close(Monster m) ;
	public abstract void runAway(String protagonist) ;
	
	public abstract String getName(Mymonster mymonster);
	public abstract void setHp(int hp) ;
	public abstract int getHp();
	public abstract int getMAXHP();
	public abstract int getAttackpoint();
	

	
}