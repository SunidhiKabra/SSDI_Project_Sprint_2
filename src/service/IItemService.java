package service;

import java.util.List;

import model.Item;

public interface IItemService {
	void addItem(Item item);
	List<Item> getItem();
}
