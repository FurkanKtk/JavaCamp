package business.concretes;

import business.abstracts.IPlayersCheckService;
import entities.Players;

public class PlayersCheckManager  implements IPlayersCheckService{

	@Override
	public boolean CheckIfRealPerson(Players players) {
		
		return true;
	}

}
