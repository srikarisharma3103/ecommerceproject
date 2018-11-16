package com.niit.serviceimplementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartItemDao;
import com.niit.model.CartItem;
import com.niit.model.CustomerOrder;
import com.niit.service.CartItemService;
@Service
@Transactional
public class CartItemServiceImpl implements CartItemService{
 @Autowired
	private CartItemDao cartItemDao;
	public void addToCart(CartItem cartItem) {
		cartItemDao.addToCart(cartItem);
		
	}
	
	public void deleteFromCart(int id) {
		cartItemDao.deleteFromCart(id);
		
	}
	
	public List<CartItem> getCart(String email) {
		
		return cartItemDao.getCart(email);
	}
	
	public void removeCartItem(int id) {
		cartItemDao.removeCartItem(id);
	}
	
	public void createCustomerOrder(CustomerOrder customerOrder) {
		cartItemDao.createCustomerOrder(customerOrder);
	}

}
