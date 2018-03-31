package com.krystian;

public class VipCustomer extends Bank{
	
	private int limit;
	
	public VipCustomer() {
		super();
	}

	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}


}
