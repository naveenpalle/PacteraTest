package com.pactera.model;

import java.util.Date;

public class Fridge {
	private String item;
	private int amount;
	private String unitStr;
	private Unit unit;
	private String useByDateStr;
	private Date useBy;
	public Fridge(){
	}
	public Fridge(String item, int amount, Unit unit, String useByDateStr) {
		super();
		this.item = item;
		this.amount = amount;
		this.unit = unit;
		this.useByDateStr = useByDateStr;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getUnitStr() {
		return unitStr;
	}
	public void setUnitString(String unitStr) {
		this.unitStr = unitStr;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public String getUseByDateStr() {
		return useByDateStr;
	}
	public void setUseByDateString(String useByDateStr) {
		this.useByDateStr = useByDateStr;
	}
	public Date getUseBy() {
		return useBy;
	}
	public void setUseBy(Date useBy) {
		this.useBy = useBy;
	}
	
}
