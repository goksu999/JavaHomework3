package adapters;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import Abstract.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer){
		
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		try {
			kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
							customer.getFirstName().toUpperCase(), 
							customer.getLastName().toUpperCase(), 
							customer.getDateOfBirth());
			
		} 
		catch (NumberFormatException exception) {
			exception.printStackTrace();
		} 
		catch (RemoteException exception) {
			exception.printStackTrace();
		}
		return false;
		}	

		
				
		

	}









/*

return kpsPublic.TCKimlikNoDogrula
		 (Long.parseLong(customer.getNationalityId()),
		 customer.getFirstName().toUpperCase(),
		 customer.getLastName().toUpperCase(), 
		 customer.getDateOfBirth());*/
