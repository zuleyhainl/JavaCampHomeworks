package JCDay4HW3;

public class GamerManager implements GamerService{

	private GamerCheckManager gamerCheckManager;
	
	
	public GamerManager(GamerCheckManager gamerCheckManager) {
		super();
		this.gamerCheckManager = gamerCheckManager;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckManager.check(gamer)==false)
		{
			System.out.println(gamer.getFirstName()+" --> adlı oyuncunun kaydı gerçekleştirilemedi");
		}
		else
			System.out.println(gamer.getFirstName()+" --> adlı oyuncu sisteme eklendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+"--> isimli kullanıcı sistemden silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+"--> isimli kullanıcı sistemde güncellendi");
		
	}


	
	

}
