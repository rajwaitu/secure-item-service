package com.techrocking.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techrocking.item.entity.Item;
import com.techrocking.item.payload.SaveItemRequest;
import com.techrocking.item.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public Item saveItem(SaveItemRequest request) {
		Item item = new Item();
		item.setName(request.getName());
		item.setCategory(request.getCategory());
		item.setSubCategory(request.getSubCategory());
		item.setQuantity(request.getQuantity());
		
		return itemRepository.save(item);

	}

	public Item getItem(Long itemId) {
		return itemRepository.findById(itemId).get();

	}

	public List<Item> getItem() {
		List<Item> allItems = new ArrayList<Item>();
		Iterable<Item> itr = itemRepository.findAll();
		itr.forEach(item -> allItems.add(item));
		return allItems;

	}
	
	private synchronized Long getNextId(Long currentId) {
		if(currentId == null) {
			return Long.valueOf(0);
		}
		return currentId + 1;
	}

}
