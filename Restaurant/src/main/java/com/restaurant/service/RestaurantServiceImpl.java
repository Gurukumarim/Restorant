package com.restaurant.service;

import java.util.List;

import com.restaurant.dao.IRestaurantDAO;
import com.restaurant.dao.RestaurantDAOImpl;
import com.restaurant.model.Restaurant;

public class RestaurantServiceImpl  implements IRestaurantService{

	
	IRestaurantDAO restaurantDAO=new RestaurantDAOImpl() ;
	@Override
	public List<Restaurant> findAll() {
		
		return  restaurantDAO.findAll();
	}

	@Override
	public List<Restaurant> getByName(String nanme) {
		
		return restaurantDAO.getByName(nanme);
	}

	@Override
	public List<Restaurant> getByLocation(String location) {
	
		return restaurantDAO.getByLocation(location);
	}

	@Override
	public List<Restaurant> getByRating(int rating) {

		return restaurantDAO.getByRating(rating);
	}

	@Override
	public List<Restaurant> getById(int id) {
		return restaurantDAO.getById(id);
	}

	@Override
	public List<Restaurant> getByType(String type) {
		return restaurantDAO.getByType(type);
	}

	@Override
	public List<Restaurant> getByCuisine(String cuisine) {
		return restaurantDAO.getByCuisine(cuisine);
	}

}
