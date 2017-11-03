/**
 * 
 */
package classes;

/**
 * @author Srinivasan
 *
 */
public class Customer {

	/**
	 * 
	 */
	
	int customer_id;
	int no_of_purchases;
	double total_amount;
	
	/**
	 * @return the customer_id
	 */
	public int getCustomer_id() {
		return customer_id;
	}

	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * @return the no_of_purchases
	 */
	public int getNo_of_purchases() {
		return no_of_purchases;
	}

	/**
	 * @param no_of_purchases the no_of_purchases to set
	 */
	public void setNo_of_purchases(int no_of_purchases) {
		this.no_of_purchases = no_of_purchases;
	}

	/**
	 * @return the total_amount
	 */
	public double getTotal_amount() {
		return total_amount;
	}
//
	/**
	 * @param total_amount the total_amount to set
	 */
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
