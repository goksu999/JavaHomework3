package interfaceAbstractDemo;

import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		//BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager = new NeroCustomerManager();
		 customerManager.save(new Customer(1, "Göksu", "Yýlmaz", new
		 GregorianCalendar(1993, 9 , 01).getTime(),"11111111111"));
		System.out.println(customerManager);
	}

}
