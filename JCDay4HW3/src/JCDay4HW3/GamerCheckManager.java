package JCDay4HW3;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean check(Gamer gamer) {
		if(gamer.getNationalityId().length()!=11) {
			System.out.println(gamer.getFirstName()+" --> adlı oyuncu gerçek değil");
			return false;
		}
		else
			return true;
		
	}



}
