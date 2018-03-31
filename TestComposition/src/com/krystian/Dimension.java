package com.krystian;

public class Dimension {

	private int width;
	private int height;
	private int length;
	
	/**
	 * @param width
	 * @param height
	 * @param length
	 */
	public Dimension(int width, int height, int length) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	
	
}
