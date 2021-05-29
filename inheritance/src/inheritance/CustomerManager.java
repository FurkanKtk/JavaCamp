package inheritance;

public class CustomerManager {
	public void add(Customer  customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
	}
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for (CustomerManager customer: customers) {
			
		}
		
	}

}
//solýd -open closed princeple