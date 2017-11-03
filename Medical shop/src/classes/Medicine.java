/**
 * Basic medicine class
 */
package classes;

/**
 * @author Srinivasan
 *
 */
public class Medicine {

	/**
	 * 
	 */
	
	String name;
	int quantity;
	String code;
	double vendor_price;
	double MRP;
	double selling_price;
	double discount;			//between 0.00 and 1.00
	String category;
	double profit;
	
	
	
	public Medicine() {
		// TODO Auto-generated constructor stub
		this.name="";
		this.quantity=0;
		this.code="";
		this.vendor_price=0.0;
		this.category="";
		this.discount=0.0;
		this.MRP=0.0;
		this.selling_price=0.0;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}


	/**
	 * @return the vendor_price
	 */
	public double getVendor_price() {
		return vendor_price;
	}


	/**
	 * @param vendor_price the vendor_price to set
	 */
	public void setVendor_price(double vendor_price) {
		this.vendor_price = vendor_price;
	}


	/**
	 * @return the mRP
	 */
	public double getMRP() {
		return MRP;
	}


	/**
	 * @param mRP the mRP to set
	 */
	public void setMRP(double mRP) {
		MRP = mRP;
	}


	/**
	 * @return the selling_price
	 */
	public double getSelling_price() {
		return selling_price;
	}


	/**
	 * @param selling_price the selling_price to set
	 */
	public void setSelling_price(double selling_price) {
		this.selling_price = selling_price;
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
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	public double findSellingPrice()				//Calculate selling price w.r.t discount
	{
		this.selling_price=(this.MRP)-(this.MRP*this.discount);
		return selling_price;
	}

	public void findProfit()
	{
		this.profit=this.selling_price-this.vendor_price;
		
	}
	
}
