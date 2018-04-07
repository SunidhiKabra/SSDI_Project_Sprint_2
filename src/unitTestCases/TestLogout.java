package unitTestCases;
import api.LogoutController;
import dao.DAO;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestLogout {
	
	@Test
	public void returnWebPageAction() {
		DAO d = new DAO();
		LogoutController lc = new LogoutController();
		String expectedPageToBeOn = "logout.do";
		String result = lc.getName();
		assertEquals(expectedPageToBeOn, result);
	}
	
	
	
}
