/**
 * 
 */
package classes;

/**
 * @author Srinivasan
 *
 */
public class Bill {

	/**
	 * 
	 */
	int bill_no;
	double amount;
	double tax;
	double discount;				//Total discount for the medicine in rupees
	int customer_id;
	
	public Bill() {
		// TODO Auto-generated constructor stub
		bill_no=0;
		amount=0.0;
		tax=0.0;
		discount=0.0;
		
	}


	/**
	 * @return the bill_no
	 */
	public int getBill_no() {
		return bill_no;
	}


	/**
	 * @param bill_no the bill_no to set
	 */
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}


	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}


	/**
	 * @return the tax
	 */
	public double getTax() {
		return tax;
	}


	/**
	 * @param tax the tax to set
	 */
	public void setTax(double tax) {
		this.tax = tax;
	}


	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}


	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
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


	

}
