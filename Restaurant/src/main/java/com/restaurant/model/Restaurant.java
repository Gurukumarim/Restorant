package com.restaurant.model;

public class Restaurant {

	private String name;
	private String location;
	private double rating;
	private int id;
	private String type;
	private String cuisine;
	
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, String location, double rating, int id, String type, String cuisine) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.id = id;
		this.type = type;
		this.cuisine = cuisine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", location=" + location + ", rating=" + rating + ", id=" + id + ", type="
				+ type + ", cuisine=" + cuisine + "]";
	}

	
}
