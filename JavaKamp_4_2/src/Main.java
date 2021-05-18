  
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager =new SturbucksCustomerManager(new MernisServiceAdapter()) ; 

		//CustomerCheckManager()=fAKE SÝMÜLE //MernisServiceAdapter=tc ile webden doðrulama
		customerManager.Save(new Customer(1, "furkan", "kütük", 1999, "15395830576"));
		System.out.println();

	}

}