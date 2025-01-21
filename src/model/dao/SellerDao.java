package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
public void insert(Seller obj);
	
	public void update(Seller obj);
	
	public void deleteByI(Integer id);
	
	Seller findById(Integer id);
	
	List<Seller> findAll();

}
