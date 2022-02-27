package com.example.Shopping.products;

public class ProductResponse{
	private String quantity;
	private OriginalAddress originalAddress;
	private String size;
	private String price;
	private String salesPrice;
	private String name;
	private String description;
	private String sizeUnit;
	private String id;
	private String satisfiedScore;

	public void setQuantity(String quantity){
		this.quantity = quantity;
	}

	public String getQuantity(){
		return quantity;
	}

	public void setOriginalAddress(OriginalAddress originalAddress){
		this.originalAddress = originalAddress;
	}

	public OriginalAddress getOriginalAddress(){
		return originalAddress;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setSalesPrice(String salesPrice){
		this.salesPrice = salesPrice;
	}

	public String getSalesPrice(){
		return salesPrice;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setSizeUnit(String sizeUnit){
		this.sizeUnit = sizeUnit;
	}

	public String getSizeUnit(){
		return sizeUnit;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSatisfiedScore(String satisfiedScore){
		this.satisfiedScore = satisfiedScore;
	}

	public String getSatisfiedScore(){
		return satisfiedScore;
	}
}
