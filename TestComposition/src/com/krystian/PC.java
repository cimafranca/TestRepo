package com.krystian;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;

	/**
	 * @param theCase
	 * @param monitor
	 * @param motherboard
	 */
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	/**
	 * @return the theCase
	 */
	public Case getTheCase() {
		return theCase;
	}

	/**
	 * @return the monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	}

	/**
	 * @return the motherboard
	 */
	public Motherboard getMotherboard() {
		return motherboard;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PC [theCase=" + theCase + ", monitor=" + monitor + ", motherboard=" + motherboard + "]";
	}

}
