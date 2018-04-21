package api;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.DAO;
import dao.ItemDao;
import model.ICustomer;
import model.IItem;
import model.Item;

public class AddCommentController extends Action{
	private ItemDao itemDAO;
	private Item item;

	public AddCommentController(DAO dao)
	// TODO Auto-generated constructor stub
	{
		itemDAO = dao.getItemDAO();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "addComment.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		String itemId = request.getParameter(("itemId"));
		int id = Integer.parseInt(itemId);
		Item item = itemDAO.getItemById(id);
		request.setAttribute("item", item);	
		return "addComment.jsp";
	}

}
