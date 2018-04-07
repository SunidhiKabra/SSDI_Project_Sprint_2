package unitTestCases;

import static org.junit.Assert.assertEquals;


import java.util.List;


import org.junit.jupiter.api.Test;


import dao.ICustomerDao;
import model.*;

class TestViewRenter {
	ICustomer customer = new Customer();
	ICustomerDao customerDao = new ICustomerDao() {
		public ICustomer getCustomerById(int id)
		{
			ICustomer testCustomer = new Customer();
			testCustomer.setID(id);
			testCustomer.setEmail("abc@y.com");
			testCustomer.setFirstName("abc");
			testCustomer.setLastName("xyz");
			testCustomer.setPassword("123");
			testCustomer.setPhoneNumber("45678");
			return testCustomer;
		}

		@Override
		public void addCustomer(Customer customer) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ICustomer getCustomer(String email) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> getCustomers() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ICustomer setCustomerById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setCustomer(Customer customer) {
			// TODO Auto-generated method stub
		
		}
	};
	
	
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


	@Test
	void test() {
		customer = customerDao.getCustomerById(1);
		assertEquals(true, equals(customer, customerDao.getCustomerById(1)));
	}

}
