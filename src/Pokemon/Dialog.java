package Pokemon;

public class Dialog {
	public static void startProlog() {
		System.out.println("【プロローグ】");
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
		System.out.println("都会に住む主人公の両親は主人公の祖父のサトシを疎んでおり、\n"
				+ "中学生の主人公にサトシの面倒を見させるために、夏休みに主人公一人をサトシの元へやった。\n"
				+ "\n"
				+ "主人公は将来はなんの目標もない平凡な中学生だ。\n"
				+ "心のどこかでいつも退屈を感じており、鬱屈とした日々が続いていた。\n"
				+ "\n"
				+ "祖父のサトシは昔は伝説のポケモンマスターと言われた人物であたが、\n"
				+ "引退して月日が流れた今はただ毎日飲んだくれの老人である。\n"
				+ "サトシは酒癖が悪く、妻のカスミや相棒であったピカチュウにすら愛想をつかされて、\n"
				+ "今は一人でマサラタウンに暮らしていた。\n"
				+ "\n"
				+ "サトシの家に預けられた主人公はある日、サトシのポケモンマスターだった頃の写真を目にする。\n"
				+ "\n"
				+ "写真をじっと見つめる主人公を見ていたサトシは自分がポケモンマスターだった頃を思い出し、\n"
				+ "死ぬ前にもう一度どうしてもピカチュウに会いたいという。\n"
				+ "\n"
				+ "ピカチュウはマサラタウンの北のオオヤマにいる。\n"
				+ "\n"
				+ "涙ながらにサトシに頼まれた主人公はむげに断れず、オオヤマのピカチュウに探して捕まえに行くことになった。"
				+ "さあ、旅に出よう！");
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
	}
	
	public static void startEpilog() {
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
		System.out.println("【プロローグ】");
		System.out.println("主人公はオーヤマのピカチュウをサトシに持っていった。\n"
				+ "サトシ「ピカチュウすまん、俺が悪かった！」\n"
				+ "オーヤマのピカチュウ「・・・」\n"
				+ "サトシ「これからはまた一緒にチームを組んでくれ！」\n"
				+ "オーヤマのピカチュウ「・・・サトシ。分かった！」\n"
				+ "\n"
				+ "それをみた主人公はヒトカゲと喜んだ！\n"
				+ "主人公はモンスターボールを高く掲げた。\n"
				+ "目指せ！ポケモンマスター！\n"
				+ "\n"
				+ "おめでとう！Game Clear！");
	}

}
