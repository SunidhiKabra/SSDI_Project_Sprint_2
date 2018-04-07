package service;

import java.util.List;

import dao.ItemDao;
import model.Item;

public class ItemService implements IItemService{
	private ItemDao item_dao;

	public ItemService(ItemDao item_dao) {
		super();
		this.item_dao = item_dao;
	}

	@Override
	public void addItem(Item item) {
		item_dao.addItem(item);
		
	}

	@Override
	public List<Item> getItem() {
		// TODO Auto-generated method stub
		return null;
	}
}
