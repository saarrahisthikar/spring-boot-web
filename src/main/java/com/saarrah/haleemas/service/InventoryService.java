package com.saarrah.haleemas.service;

import java.util.List;

import com.saarrah.haleemas.model.Item;

public interface InventoryService {

	Item addInventory(Item item);

	List<Item> displayItems();

}
