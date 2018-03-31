package com.krystian;

public class Civic extends Car{

	private int roadService;
	
	public Civic(int doors, int gear, boolean isManual, int roadService) {
		super("Civic", "subcompact" , 4, doors, gear, isManual);
		this.roadService = roadService;
	}

	public void accelerate(int rate) {
		int newVelocity = getCurrentVelocity() + rate;
		if (newVelocity ==0) {
			stop();
		} else if (newVelocity > 0 && newVelocity <=10) {
			setCurretGear(1);
		} else if (newVelocity >10 && newVelocity <=20) {
			setCurretGear(2);
		} else if (newVelocity > 20 && newVelocity <=30) {
			setCurretGear(3);
		} else if (newVelocity > 30 && newVelocity <=40) {
			setCurretGear(4);
		} else if (newVelocity > 40 && newVelocity <= 220) {
			setCurretGear(5);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Civic [roadService=" + roadService + ", getCurretGear()=" + getCurretGear() + ", getName()=" + getName()
				+ ", getSize()=" + getSize() + ", getCurrentVelocity()=" + getCurrentVelocity()
				+ ", getCurrentDirection()=" + getCurrentDirection() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
}
