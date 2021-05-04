package concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	
	
	    private CustomerCheckService customerCheckService;
	    
		public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
			super();
			this.customerCheckService = customerCheckService;
		}

		@Override
		public void save(Customer customer) {
			if(customerCheckService.checkIfRealPerson(customer)) {
				System.out.println("Valid person.");
			super.save(customer);
		}
		else {
			
			System.out.println("Not valid.");
		}
			
		
		}
		
}

/*
 * //dependency injection private CustomerCheckService customerCheckService;
 * 
 * public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
 * super(); this.customerCheckService = customerCheckService; }
 * 
 * @Override public void save(Customer customer){
 * if(customerCheckService.checkIfRealPerson(customer)) { super.save(customer);
 * }else { //throw new Exception("Not a valid person");
 * System.out.println(" . "); }
 * 
 * 
 * }
 */


	
