package com.ramya.assignment;

import org.springframework.stereotype.Component;

@Component
public class Item
{
	private String itemName;
	private String itemPrice;
	public String getItemName() 
	{
		return itemName;
	}
	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}
	public String getItemPrice()
	{
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) 
	{
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString()
	{
		return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}
	
}
