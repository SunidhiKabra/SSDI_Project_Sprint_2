package unitTestCases;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import dao.CustomerDao;
import model.Customer;
import model.ICustomer;
import utilities.ConnectionData;


public class TestCustomerDao {
	
	@Mock
	private DataSource ds;
	@Mock
	private Connection c;
	@Mock
	private PreparedStatement stmt;
	@Mock
	private CustomerDao cd;
	
	private ConnectionData cdata = new ConnectionData();
	private CustomerDao cdTest = new CustomerDao(cdata);
	
	
	@Before
	public void setUp() throws Exception {
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDemo", "root", "test");
		c.createStatement();
	}
	@After
	public void tearDown() throws Exception {
		
	}
	@Test
	public void showNewCustomer() {
		ResultSet rs = null;
		PreparedStatement p = null;
		String sql=null;
		try {
			Customer testCust = new Customer("rohan","kapoor","r@uncc.edu","pass","1234567");
			cdTest.addCustomer(testCust);
			sql = "SELECT * FROM Customer";
			p = c.prepareStatement(sql);
			rs = p.executeQuery();
			assertEquals(true, rs.next());
			assertEquals("rohan", rs.getString("firstName"));
			assertEquals("kapoor", rs.getString("lastName"));
			assertEquals("r@uncc.edu", rs.getString("emailID"));
			assertEquals("pass", rs.getString("password"));
			assertEquals("1234567", rs.getString("phoneNumber"));
		}
		catch (SQLException e) {
			assertFalse(true);
		}
		finally {
			
		}
		/*
		p = null;
		rs = null;
		try {
			//sql = "delete from Customer where emailID = ?";
			p = c.prepareStatement("delete from Customer where emailID = ?");
			p.setString(1,"r@uncc.edu");
			rs = p.executeQuery();
			
		}
		catch (Exception e) {
			assertFalse(true);
		}*/
	}
	@Test
	public void getCustomerByEmail() {
		
		try {
			Customer testCust = new Customer("rohan","kapoor","rk@uncc.edu","pass","1234567");
			cdTest.addCustomer(testCust);
			ICustomer returnCust = cdTest.getCustomer("rk@uncc.edu");
			assertEquals(testCust.getFirstName(), returnCust.getFirstName());
			assertEquals(testCust.getEmail(), returnCust.getEmail());
			assertEquals(testCust.getLastName(), returnCust.getLastName());
			assertEquals(testCust.getPassword(), returnCust.getPassword());
			assertEquals(testCust.getPhoneNumber(), returnCust.getPhoneNumber());
			
		}
		catch (Exception e) {
			assertFalse(true);
		}
	}
}
