package com.pactera.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.pactera.model.Fridge;
import com.pactera.model.Recipe;
import com.pactera.utility.CsvReaderUtility;
import com.pactera.utility.JsonReaderUtility;

public class Main {
	public static void main(String args[]) throws IOException{

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     System.out.print("Enter csv file ");
	     String csvfile = br.readLine();
	     System.out.print("Enter json file ");
	     String jsonfile = br.readLine();
        
	     List<Fridge> fridgeItems = CsvReaderUtility.getAllFridgeIems(csvfile);
	     List<Recipe> recipeList = JsonReaderUtility.getAllRecipes(jsonfile);
	     ProcessOrder processOrder = new ProcessOrder();
	     String orderStatus = processOrder.processOrder(fridgeItems, recipeList);
	     System.out.println("Order Status : " + orderStatus);
	     
        System.out.println(csvfile + " " + jsonfile);
        //reader.close();  
	}
	
	

}
