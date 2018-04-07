
package api;

import dao.*;
import model.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class ViewItemController extends Action {
	private ItemDao itemDAO;
	
	public ViewItemController(DAO dao) {
		itemDAO = dao.getItemDAO();
	}
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "viewItems.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<String> errors = new ArrayList<String>();
		List<IItem> items = itemDAO.getItems();
		request.setAttribute("errors", errors);
		request.setAttribute("items", items);	
		return "viewItems.jsp";
	}

}