package game;

public class CustomerManager implements ICustomerService {

	ICustomerCheckService customerCheckService;
	
	public CustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void add(Customer customer) {
		
		if (customerCheckService.check(customer) == true) {
			System.out.println(customer.getFirstName() + " adl� kullan�c� eklendi.");
		}
		
		else {
			System.out.println("invalid...");
		}
		
	}

	@Override
	public void upDate(Customer customer) {
		System.out.println(customer.getFirstName() + " adl� kullan�c� g�ncellendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " adl� kullan�c� silindi.");
		
	}
	
}
