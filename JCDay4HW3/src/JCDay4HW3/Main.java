package JCDay4HW3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer(1,"züleyha","inal","11111111111","13.13.2013");
		Game game = new Game(1,"PUBG",250);
		Campaign campaign = new Campaign(1,"bahar kampanyası",10);
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		gamerManager.add(gamer);
		campaignManager.add(campaign);
		gameManager.add(game);
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer, game);
		System.out.println();
		saleManager.sale(gamer, game, campaign);
		
	}

}
