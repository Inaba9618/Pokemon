package Pokemon.pokemozukan;

import java.util.HashMap;
import java.util.Map;

import Pokemon.superclass.Monster;

public class Pokemonzukan {
	static Map<String, Integer> map = new HashMap<String, Integer>() {
	    {	put("ピカチュウ", 0);
	        put("ニョロモ" , 0);
	        put("コダック" , 0);
	        put("フリーザ" , 0);
	      }
	    };
	
			
	public static void writePokemonzukan(Monster monster) {
		System.out.println("ポケモン図鑑に"+monster.getName(monster)+"を追加した");  
		for (String str : map.keySet()) {
			  if(str.equals(monster.getName(monster))) {
			  map.put(str,map.get(str)+1);
			  }
		    }
	}
	
	public static void lookPokemonzukan() {
		System.out.println("【ポケモン図鑑】");  
		for (String str : map.keySet()) {
			if (map.get(str)>0) {
			System.out.print(str+":"+map.get(str)+"匹    "); 
			} 
		}
		System.out.println(""); 
	}
	}
	

