package com.krystian;

public class Case {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimension dimension;
	/**
	 * @param model
	 * @param manufacturer
	 * @param powerSupply
	 * @param dimensions
	 */
	public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @return the powerSupply
	 */
	public String getPowerSupply() {
		return powerSupply;
	}
	/**
	 * @return the dimensions
	 */
	public Dimension getDimension() {
		return dimension;
	}
	
	
}
