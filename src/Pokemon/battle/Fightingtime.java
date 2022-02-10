package Pokemon.battle;

import Pokemon.superclass.Monster;
import Pokemon.superclass.Mymonster;

public class Fightingtime {

	public int fight(Mymonster mymonster,Monster monster,int num3,String protagonist) {
		switch(num3) {
		 case 1:
			boolean Getmonsterresult = mymonster.monsterBall(monster,protagonist);
			if (Getmonsterresult == true && monster.getName(monster) == "ピカチュウ") {
				return 2;
			}
			if (Getmonsterresult == true) {
				return 1;
			}
			monster.attack(mymonster);
			if (mymonster.getHp() <= 0) {
				System.out.println(mymonster.getName(mymonster)+"は倒れた");
				try {
					Thread.sleep(2000);		
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}					
				System.out.println(protagonist+"はポケモンセンターに向かった");
				mymonster.setHp(mymonster.MAXHP);
				System.out.println(mymonster.getName(mymonster)+"のHPが全回復した");
				
				return 1;
			}
			return 0;
		 case 2:
			 mymonster.attack(monster);
			if (monster.getHp() >0) {
				monster.attack(mymonster);
				if (mymonster.getHp() <= 0) {
					System.out.println(mymonster.getName(mymonster)+"は倒れた。--GAMEOVER--");
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
					System.out.println(protagonist+"はポケモンセンターに向かった");
					mymonster.setHp(mymonster.MAXHP) ;
					System.out.println(mymonster.getName(mymonster)+"のHPが全回復した");
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
					return 1;
				}
				return 0;
			}
			
			
			return 1;
		 case 3:
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
			mymonster.close(monster);
			monster.attack(mymonster);
			if (mymonster.getHp() <= 0) {
					System.out.println(mymonster.getName(mymonster)+"は倒れた。--GAMEOVER--");
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
					System.out.println(protagonist+"はポケモンセンターに向かった");
					mymonster.setHp(mymonster.getMAXHP()) ;
					System.out.println(mymonster.getName(mymonster)+"のHPが全回復した");
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
					return 1;
				}
			
			return 0; 
		 case 4:
			 mymonster.runAway(protagonist);
			return 1; 
		}
		return 0;
	}
}

