package com.restaurant.client;

import com.restaurant.dao.IRestaurantDAO;
import com.restaurant.dao.RestaurantDAOImpl;
import com.restaurant.service.IRestaurantService;
import com.restaurant.service.RestaurantServiceImpl;

public class MainClass {
	
	public static void main(String[] args) {
		
		IRestaurantDAO iRestaurantDAO=new RestaurantDAOImpl();
		
		iRestaurantDAO.findAll().forEach(System.out::println);
		
		System.out.println(".....................................");

		iRestaurantDAO.getByName("bagini").forEach(System.out::println);
		iRestaurantDAO.getByLocation("bangalore").forEach(System.out::println);
		iRestaurantDAO.getByRating(4).forEach(System.out::println);
		iRestaurantDAO. getById(1).forEach(System.out::println);
		iRestaurantDAO.getByType("veg").forEach(System.out::println);
		iRestaurantDAO.getByCuisine("paneer").forEach(System.out::println);
	}
	
	

}
