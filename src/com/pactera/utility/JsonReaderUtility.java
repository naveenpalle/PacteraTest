package com.pactera.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.pactera.model.Recipe;

public class JsonReaderUtility {

	public static List<Recipe> getAllRecipes(String jsonFilePah) {
		List<Recipe> recipeList = new ArrayList<Recipe>();
		JsonParser parser = new JsonParser();
	     try {
	    	 BufferedReader br = new BufferedReader(new FileReader(jsonFilePah));
			 Recipe[] list = new Gson().fromJson(br, Recipe[].class);
			 for (Recipe recipe : list)
			 {
				recipeList.add(recipe);
			 }
	   } catch (FileNotFoundException e) {
		e.printStackTrace();
	     } catch (IOException e) {
		e.printStackTrace();
	     }
	 
	     return recipeList;
	   }
}
