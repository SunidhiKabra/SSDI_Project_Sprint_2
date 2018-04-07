package service;

import java.util.List;

import model.Customer;

public interface ICustomerService {
	void addCustomer(Customer customer);
	List<Customer> getCustomers();
}
