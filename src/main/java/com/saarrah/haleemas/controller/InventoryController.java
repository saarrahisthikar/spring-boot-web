package com.saarrah.haleemas.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saarrah.haleemas.model.Item;
import com.saarrah.haleemas.service.InventoryService;

@RestController
public class InventoryController {

	private static final Log log = LogFactory.getLog(InventoryController.class);

	@Autowired
	private InventoryService inventoryService;

	@GetMapping(path = "/hello")
	public String sayHello(String name) {
		log.info("Request received for say hello for the name " + name);
		return "Hello " + name;
	}

	@PostMapping(name = "/add")
	public Item addInventory(String itemName) {
		Item item = new Item();
		item.setName(itemName);
		item.setProductionDate(new Date());
		item.setUnitPrice(300.00);
		item.setQuantity(100);

		inventoryService.addInventory(item);

		log.info("Iteam saved to the inventory " + item);

		return item;

	}

	@GetMapping(path = "/view")
	public List<Item> viewInventory(){
		return inventoryService.displayItems();
	}
}
