package Adapters;


import java.rmi.RemoteException;



import business.abstracts.IPlayersCheckService;
import entities.Players;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayersCheckService{

	@Override
	public boolean CheckIfRealPerson(Players players ) {
		
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(players.getNationalityId()), players.getFirstName(), players.getLastName(),players.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
 
	
	
	

}