/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author Kathleen Falcon
 *
 */
public class Child extends Parent implements Asks4money, SpendsMoney {
	private String favoriteFood;
	
	public Child() {
		//java will automagically do this line
		//super();
	}
	
	public Child(float _debt, String _name, String _lastName, float _wealth, String _favoriteFood) {
		super(_debt, _name, _lastName, _wealth);
		favoriteFood = _favoriteFood;
		//super.wealth += 100;
	}
	
	//this is a copy constructor
	public Child(Child c) {
		this(c.getDebt(), c.getName(), c.getLastName(), c.wealth, c.favoriteFood);
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.ass3.chapter8.SpendsMoney#spendMoney(float)
	 */
	@Override
	public boolean spendMoney(float _money2spend) {
		boolean retVal = false;
		if (_money2spend <= wealth) {
			wealth -= _money2spend;
			retVal = true;
		}
		return retVal;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.ass3.chapter8.Asks4money#investInMe(float)
	 */
	@Override
	public float investInMe(float _amount2ask) {
		return 0;
	}

}
