package com.saarrah.haleemas.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.saarrah.haleemas.model.Item;

@Component
public interface InventoryDao extends CrudRepository<Item, Integer> {

}
