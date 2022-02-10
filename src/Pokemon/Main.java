package Pokemon;


import java.util.Scanner;

import Pokemon.battle.Fightingtime;
import Pokemon.mymonster.Hitokage;
import Pokemon.mymonster.Hushigidane;
import Pokemon.mymonster.Zenigame;
import Pokemon.place.Desert;
import Pokemon.place.Lake;
import Pokemon.place.Pokemoncenter;
import Pokemon.place.Topofmountain;
import Pokemon.pokemozukan.Pokemonzukan;
import Pokemon.superclass.Monster;
import Pokemon.superclass.Mymonster;
import Pokemon.superclass.Town;

public class Main {
	public static void main(String[] args) {
		Dialog.startProlog();
		
		System.out.println("主人公の名前を入力してください" );
		Scanner scan1 = new Scanner(System.in);
		String Protagonistname = scan1.next();
		
		System.out.println("オーキド博士:「3体の中からポケモンを選ぶのじゃ」");
		System.out.println("1.「ヒトカゲ」 2.「ゼニガメ」 3.「フシギダネ」");
		Scanner scan5 = new Scanner(System.in);
		int pokemonnumber = scan5.nextInt();
		
		Mymonster[] mine = new Mymonster[3];
        mine[0] = new Hitokage();
        mine[1] = new Zenigame();
        mine[2] = new Hushigidane();
        
    	Mymonster mymonster = mine[pokemonnumber-1];
    	System.out.println(Protagonistname+"は"+mymonster.getName(mymonster)+"を選んだ");		
    	System.out.println(mymonster.getName(mymonster)+"のステータス: HP"+mymonster.getHp()+"/"+mymonster.getMAXHP()+"  攻撃力:"+mymonster.getAttackpoint());	
		System.out.println(Protagonistname +"「よし！オオヤマのピカチュウを探そう」" );
		
		boolean Gameclear = false;
		while (Gameclear == false) {
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
		System.out.println("どこに行こう。 1.オオヤマの湖　2.オオヤマ砂漠 3.オオヤマの頂上 4.ポケモンセンター 5.ポケモン図鑑");
		System.out.println("現在の"+mymonster.getName(mymonster)+"のHP   "+mymonster.getHp()+"/"+mymonster.getMAXHP());
		Scanner scan2 = new Scanner(System.in);		
        int num2 = scan2.nextInt();
        
        Town[] town = new Town[3];
        town[0] = new Lake();
        town[1] = new Desert();
        town[2] = new Topofmountain();
		switch(num2) {
		case 1,2,3:
			Town town1 = town[num2-1];
			Monster monster = town1.apperance(mymonster,Protagonistname);
			if (monster == null) {continue;}
			
			int Tacticschoice = 0;
			while (Tacticschoice == 0) {
				System.out.println("さあどうする? 1.モンスターボールを投げる 2.攻撃する 3.近づく 4.逃げる");
				Scanner scan3 = new Scanner(System.in);
				int num3 = scan3.nextInt();
				Fightingtime f = new Fightingtime();
				Tacticschoice = f.fight(mymonster,monster,num3,Protagonistname);
				if (Tacticschoice == 2) {
					Gameclear = true;
				}
			}
			break;
		
		case 4:
			Pokemoncenter pokemoncenter = new Pokemoncenter();
			System.out.println(Protagonistname+"は"+pokemoncenter.name+"を訪れた");
			pokemoncenter.heal(mymonster);
			break;
		
		case 5:
			Pokemonzukan.lookPokemonzukan();
			break;
			
		}
		
	}
		System.out.println("ピカチュウをゲットした！" );
		Dialog.startEpilog();
	}
}
