package com.pactera.model;

import java.io.Serializable;
import java.util.List;
public class Recipe implements Serializable{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private String name;
private List<Ingredient> ingredients;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public List<Ingredient> getIngredients() {
	return ingredients;
}
public void setIngredients(List<Ingredient> ingredients) {
	this.ingredients = ingredients;
}


}
