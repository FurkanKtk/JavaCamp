package interfaces;

public class CustomerManeger {
	private Logger[] loggers;
	
	public CustomerManeger(Logger[] loggers) {
		this.loggers = loggers;
	}
	//loosly- tightly coupled
	
	public void add(Customer customer) {
		System.out.println("müþteri eklendi" + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	public void delete(Customer customer) {
		System.out.println("müþteri silindi" + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
	}

}
