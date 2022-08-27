package com.restaurant.service;

import java.util.List;

import com.restaurant.model.Restaurant;

public interface IRestaurantService  {

	List<Restaurant>findAll();


	List<Restaurant>getByName(String nanme);

	List<Restaurant>getByLocation(String location);

	List<Restaurant>getByRating(int rating);

	List<Restaurant>getById(int id);

	List<Restaurant>getByType(String type);

	List<Restaurant>getByCuisine(String cuisine);



}
