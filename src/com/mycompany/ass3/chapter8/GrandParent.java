/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author Kathleen Falcon
 *
 */
public class GrandParent implements HasName {
	private float debt;
	private String name;
	private String lastName;
	
	public GrandParent() {
		this(0, "oldMan", "grandPa");
	}
	
	public GrandParent(float debt, String _name, String _lastName) {
		this.debt = debt;
		name = _name;
		lastName = _lastName;
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.ass3.chapter8.HasName#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.ass3.chapter8.HasName#getLastName()
	 */
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}
	
	public float getDebt() {
		return debt;
	}

}
