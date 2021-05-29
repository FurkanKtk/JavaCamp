package polymorphismDemo;

public class Mian {

	public static void main(String[] args) {
	//	EmailLogger logger=new EmailLogger();
	//	logger.Log("log mesajý");
		
		/*BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		for (BaseLogger logger:loggers) {
			logger.Log("log mesajý");
		} 
		*/
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.Add();

	}

}
