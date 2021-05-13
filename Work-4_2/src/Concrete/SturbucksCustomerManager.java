package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager{
	
	ICustomerCheckService _customerCheckService;
	public  SturbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService=customerCheckService;
	}
	
	
	@Override
	public void Save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
			}else {
				System.out.println("Kiþi Bulunamadý.");
			}
    
	
	
	}
	}
