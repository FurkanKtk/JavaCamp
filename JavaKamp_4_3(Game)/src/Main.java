



import Adapters.MernisServiceAdapter;
import business.abstracts.BasePlayersManager;
import business.abstracts.IGameSaleService;
import business.concretes.GameSaleManager;
import business.concretes.PlayersCheckManager;
import business.concretes.PlayersManager;
import entities.GameSale;
import entities.Players;

public class Main {

	public static void main(String[] args) {
		
		BasePlayersManager manager =new PlayersManager(new MernisServiceAdapter());
			manager.add(new Players(3, "furkan", "kütük", 1999, "15395830576"));
		System.out.println();
	
		GameSaleManager gameManager = new GameSaleManager();
		GameSale game1 = new GameSale(1,"oyun1","abs","a marka",9.90);
		gameManager.add(game1 );
		System.out.println(game1.getName()+ " eklendi");
	
		

	}

}
