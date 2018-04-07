package unitTestCases;
import dao.*;
import model.*;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class GetCustomerByIdTest {

	@Test
	public void test() {
		ICustomerDao customerDao = new CustomerDao();
		ICustomer customer = customerDao.getCustomerById(1);
		ICustomer testCustomerData = getTestCustomer();
		boolean result = equals(customer, testCustomerData);
		assertEquals(true, result);
	}
	
	public ICustomer getTestCustomer()
	{
		ICustomer customer = new Customer();
		customer.setFirstName("Kratika");
		customer.setLastName("Mundra");
		customer.setEmail("kmundra@uncc.edu");
		customer.setPassword("123");
		customer.setPhoneNumber("123456789");
		return customer;
	}
	
	public boolean equals(Object object1, Object object2)
	{
		if (object1 instanceof ICustomer && object2 instanceof ICustomer) {
			ICustomer cust1 = (ICustomer) object1;
			ICustomer cust2 = (ICustomer) object2;
			
			return cust1.getEmail().equals(cust2.getEmail()) &&
				   cust1.getPassword().equals(cust2.getPassword()) &&
				   cust1.getFirstName().equals(cust2.getFirstName()) &&
				   cust1.getLastName().equals(cust2.getLastName()) &&
				   cust1.getPhoneNumber().equals(cust2.getPhoneNumber());
			
		}
		return false;
	}

}
