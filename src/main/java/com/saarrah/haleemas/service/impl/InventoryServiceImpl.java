package com.saarrah.haleemas.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saarrah.haleemas.dao.InventoryDao;
import com.saarrah.haleemas.model.Item;
import com.saarrah.haleemas.service.InventoryService;

@Component
public class InventoryServiceImpl implements InventoryService {

	private static final Log log = LogFactory.getLog(InventoryServiceImpl.class);

	@Autowired
	private InventoryDao inventoryDao;

	@Override
	public Item addInventory(Item item) {
		log.info("Inventory service - add Item " + item);
		inventoryDao.save(item);
		return item;
	}
	
	public List<Item> displayItems(){
		List<Item> items = (List<Item>) inventoryDao.findAll();
		return items;
	}


}
