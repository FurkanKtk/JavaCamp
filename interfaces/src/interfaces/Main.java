package interfaces;

public class Main {

    public static void main(String[] args) {

        Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};

        CustomerManeger customerManager = new CustomerManeger(loggers);

        Customer engin = new Customer(1,"Engin","Demiroð");

        customerManager.add(engin);
    }

}