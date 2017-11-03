/**
 * 
 */
package action_code;
import java.util.*;
import classes.*;

/**
 * @author Srinivasan
 *
 */
public class AddMedicine {

	/**
	 * 
	 */
	public AddMedicine() {
		// TODO Auto-generated constructor stub
	}
	public void addmedicine(Medicine m)
	{
		
		System.out.println("Enter name: ");
		Scanner sc=new Scanner(System.in);
		m.setName(sc.next());		
		System.out.println("Enter quantity: ");
		m.setQuantity(sc.nextInt());
		System.out.println("Enter code: ");
		m.setCode(sc.next());
		System.out.println("Enter vendor price: ");
		m.setVendor_price(sc.nextDouble());
		System.out.println("Enter MRP: ");
		m.setMRP(sc.nextDouble());
		System.out.println("Enter discount: ");
		m.setDiscount(sc.nextDouble());
		System.out.println("Enter category: ");
		m.setCategory(sc.next());
		m.findSellingPrice();
		System.out.println("Thank you!");
		sc.close();
	}

}
