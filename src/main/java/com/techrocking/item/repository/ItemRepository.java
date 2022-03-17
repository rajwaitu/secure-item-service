package com.techrocking.item.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techrocking.item.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
	
	@Query("SELECT MAX(i.id) FROM Item i")
	public Long getMaxId();

}
