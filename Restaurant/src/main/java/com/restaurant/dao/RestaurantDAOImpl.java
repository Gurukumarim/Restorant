package com.restaurant.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.restaurant.model.Restaurant;

public class RestaurantDAOImpl implements IRestaurantDAO {

	@Override
	public List<Restaurant> findAll() {

		return showAll();
	}

	@Override
	public List<Restaurant> getByName(String nanme) {

		return showAll().stream().filter(name -> name.getName().contains("s"))
				.sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<Restaurant> getByLocation(String location) {

		return showAll().stream().filter(name -> name.getLocation().startsWith("a"))
				.sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<Restaurant> getByRating(int rating) {

		return showAll().stream().filter(name -> name.getRating() > 5)
				.sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<Restaurant> getById(int id) {

		return showAll().stream().filter(name -> name.getId() > 6)
				.sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<Restaurant> getByType(String type) {

		return showAll().stream().filter(name -> name.getType().endsWith("k"))
				.sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).collect(Collectors.toList());

	}

	@Override
	public List<Restaurant> getByCuisine(String cuisine) {

		return showAll().stream().filter(name -> name.getCuisine().startsWith("b"))
				.sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).collect(Collectors.toList());
	}

	private List<Restaurant> showAll() {

		return Arrays.asList(new Restaurant("bagini", "bangalore", 4.5, 1, "veg", "paneer"),
				new Restaurant("durga", "chitrudurga", 4.1, 2, "nonveg", "beriyani"),
				new Restaurant("basaveshwara", " bangalore", 4.6, 3, "veg", "rooti"),
				new Restaurant("shiva", "davanagere", 5.0, 4, "veg", "palaw"),
				new Restaurant("taj", "bangalore", 4.8, 5, "nonveg", "dhumberiyani"));

	}

}
