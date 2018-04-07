package unitTestCases;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dao.IItemDao;
import model.*;

class TestViewItem {
	
	IItem item = new Item();
	IItemDao itemDao = new IItemDao()
			{

				@Override
				public void addItem(Item item) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public List<IItem> getItems() {
					// TODO Auto-generated method stub
					List<IItem> lstItems = new ArrayList<IItem>(); 
					item.setCustomerId(1);
					item.setName("book");
					item.setDescription("book");
					item.setRent(10.0f);
					lstItems.add(item);
					return lstItems;
				}
		
			};

	@Test
	void test() {
		item = itemDao.getItems().get(0);
		assertEquals(item, itemDao.getItems().get(0));
	}

}
