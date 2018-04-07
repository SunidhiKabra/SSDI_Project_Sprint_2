package dao;

import utilities.ConnectionData;



public class DAO {
	private ConnectionData conn_data = new ConnectionData();
	
	private ItemDao itemDAO;
	private CustomerDao customerDao;
	
	public DAO() 
	{
		
		itemDAO = new ItemDao(conn_data); 
		customerDao = new CustomerDao(conn_data);

	}
	public ItemDao getItemDAO() {
		return itemDAO;
	}
	
	public CustomerDao getCustomerDAO()
	{
		return customerDao;
	}

}