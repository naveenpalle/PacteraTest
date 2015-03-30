package com.pactera.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.pactera.model.Fridge;
import com.pactera.model.Unit;

public class CsvReaderUtility {
	
	public static List<Fridge> getAllFridgeIems(String csvFilePath) {
		List<Fridge> fridgeList = new ArrayList<Fridge>();
		try {
			CsvReader fridgeItems = new CsvReader(new FileReader(csvFilePath));
			fridgeItems.readHeaders();
			while (fridgeItems.readRecord())
			{
				Fridge fridge = new Fridge();
				fridge.setItem(fridgeItems.get("Item"));
				fridge.setAmount(Integer.parseInt(fridgeItems.get("Amount")));
				fridge.setUnit(Unit.getValue(fridgeItems.get("Unit")));
				fridge.setUseBy((DateUtility.convertStringDateToUilDate(fridgeItems.get("Use-By"))));
				fridgeList.add(fridge);
			}
	
			fridgeItems.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fridgeList;
		
	}

}
