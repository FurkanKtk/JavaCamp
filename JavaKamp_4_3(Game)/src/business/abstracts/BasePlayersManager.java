package business.abstracts;

import entities.Players;

public abstract class BasePlayersManager implements IPlayersService{

	@Override
	public void add(Players players) {
		System.out.println("veri tabanýna eklendi  :"+ players.getFirstName());
		
	}

	@Override
	public void update(Players players) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Players players) {
		// TODO Auto-generated method stub
		
	}

}
