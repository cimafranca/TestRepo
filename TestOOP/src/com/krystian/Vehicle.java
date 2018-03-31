package com.krystian;

public class Vehicle {

	private String name;
	private String size;
	private int currentVelocity;
	private int currentDirection;

	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;

		this.currentDirection = 0;
		this.currentVelocity = 0;
	}


	public void streer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer() : Steering at" + currentDirection + "degrees.");
	}

	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle.move() : Moving at " + currentVelocity + "in direction" + currentDirection);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the currentVelocity
	 */
	public int getCurrentVelocity() {
		return currentVelocity;
	}

	/**
	 * @param currentVelocity
	 *            the currentVelocity to set
	 */
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	/**
	 * @return the currentDirection
	 */
	public int getCurrentDirection() {
		return currentDirection;
	}

	/**
	 * @param currentDirection
	 *            the currentDirection to set
	 */
	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}

	public void stop() {
		this.currentVelocity = 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", size=" + size + ", currentVelocity=" + currentVelocity
				+ ", currentDirection=" + currentDirection + "]";
	}

}
