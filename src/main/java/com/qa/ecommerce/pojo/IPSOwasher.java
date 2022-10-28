package com.qa.ecommerce.pojo;

public class IPSOwasher {
	private String name;
	private String loadCapacity;
	private String dimensions;
	private String netWeight;
	private String price;

	public IPSOwasher(String name, String loadCapacity, String dimensions, String netWeight, String price) {
		super();
		this.name = name;
		this.loadCapacity = loadCapacity;
		this.dimensions = dimensions;
		this.netWeight = netWeight;
		this.price = price;
	}

	public IPSOwasher() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(String loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public String getdimensions() {
		return dimensions;
	}

	public void setdimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(String netWeight) {
		this.netWeight = netWeight;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
