package com.krystian;

public class Motherboard {

	private String model;
	private String manufactrurer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	/**
	 * @param model
	 * @param manufactrurer
	 * @param ramSlots
	 * @param cardSlots
	 * @param bios
	 */
	public Motherboard(String model, String manufactrurer, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufactrurer = manufactrurer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @return the manufactrurer
	 */
	public String getManufactrurer() {
		return manufactrurer;
	}
	/**
	 * @return the ramSlots
	 */
	public int getRamSlots() {
		return ramSlots;
	}
	/**
	 * @return the cardSlots
	 */
	public int getCardSlots() {
		return cardSlots;
	}
	/**
	 * @return the bios
	 */
	public String getBios() {
		return bios;
	}
	
	
}
