package JCDay4HW3;

public class SaleManager {
	
	public void sale(Gamer gamer, Game game)
	{
		System.out.printf("%s isimli kullanıcıya %s oyunu %.2f tl fiyatına kampanyasız satıldı",gamer.getFirstName(), game.getName(), game.getPrice());
	}
	
	public void sale(Gamer gamer, Game game, Campaign campaign)
	{
		double price = game.getPrice() - (game.getPrice() * campaign.getDiscountPer())/100;
		System.out.printf("%s isimli kullanıcıya %s oyunu \"%s\" kampanyasıyla %.2f tl fiyatına satıldı",gamer.getFirstName(), game.getName(), campaign.getCampaignName() , price);
	}

}
