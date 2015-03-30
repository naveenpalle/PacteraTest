package com.pactera.main;

import java.util.List;

import com.pactera.model.Fridge;
import com.pactera.model.Ingredient;
import com.pactera.model.Recipe;
import com.pactera.utility.DateUtility;

public class ProcessOrder {
	String orderStatus = "";
	Fridge fr;
	Recipe rc;
	public String processOrder(List<Fridge> fridgeItems, List<Recipe> recipeList){
		boolean orderFound = false;
		for(Recipe recipe : recipeList){
			List<Ingredient> ingredientList = recipe.getIngredients();
			for(Ingredient ing : ingredientList){
				for(Fridge fridge : fridgeItems){
					if(ing.getItem().equalsIgnoreCase(fridge.getItem())){
						orderFound = true;
						fr = fridge;
						rc = recipe;
						break;
					}
				}
			}
		}
				
				if(!orderFound){
					return "Order Takeout";
				}
				else{
					if(fr.getUseBy().before(DateUtility.milliesToDate(System.currentTimeMillis()))){
						return "Can not be cooked. It is expired";
					}
					else
					{
						return fr.getItem();
					}
					
				}
	
		
	}
	
}
