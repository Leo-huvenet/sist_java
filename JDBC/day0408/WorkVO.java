

package day0408;

import java.sql.Date;

public class WorkVO {
	private String maker, model, car_option;
	private int price;
	private Date hiredate;
	
	public WorkVO() {
		super();
	}

	public WorkVO(String maker, String model, String car_option, int price, Date hiredate) {
		super();
		this.maker = maker;
		this.model = model;
		this.car_option = car_option;
		this.price = price;
		this.hiredate = hiredate;
	}

	/**
	 * @return the maker
	 */
	public String getMaker() {
		return maker;
	}

	/**
	 * @param maker the maker to set
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the car_option
	 */
	public String getCar_option() {
		return car_option;
	}

	/**
	 * @param car_option the car_option to set
	 */
	public void setCar_option(String car_option) {
		this.car_option = car_option;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the hiredate
	 */
	public Date getHiredate() {
		return hiredate;
	}

	/**
	 * @param hiredate the hiredate to set
	 */
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
}
