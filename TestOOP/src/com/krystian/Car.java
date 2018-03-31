package com.krystian;

public class Car extends Vehicle {

	private int wheels;
	private int doors;
	private int gear;
	private boolean isManual;

	private int curretGear;



	/**
	 * @param name
	 * @param size
	 * @param wheels
	 * @param doors
	 * @param gear
	 * @param isManual
	 * @param curretGear
	 */
	public Car(String name, String size, int wheels, int doors, int gear, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gear = gear;
		this.isManual = isManual;
	}

	/**
	 * @return the curretGear
	 */
	public int getCurretGear() {
		return curretGear;
	}

	/**
	 * @param curretGear
	 *            the curretGear to set
	 */
	public void setCurretGear(int curretGear) {
		this.curretGear = curretGear;
		System.out.println("Car.setCurrentGear(): Changed to " + this.curretGear + "gear.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.krystian.Vehicle#move(int, int)
	 */
	@Override
	public void move(int velocity, int direction) {
		super.move(velocity, direction);
		System.out.println("Move :Velocity " + velocity + "direction " + direction);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.krystian.Vehicle#stop()
	 */
	@Override
	public void stop() {
		super.stop();
	}

}