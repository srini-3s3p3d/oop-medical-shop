/**
 * 
 */
package action_code;
import java.util.Scanner;

import classes.Medicine;

/**
 * @author Srinivasan
 *
 */
public class UpdateMedicine {

	/**
	 * 
	 */
	public UpdateMedicine() {
		// TODO Auto-generated constructor stub
	}
	
	public void updatemed(Medicine m)
	{
		System.out.println("Enter details you want to update");
		System.out.println("1.Discount");
		System.out.println("2.Vendor price");
		System.out.println("3.MRP");
		System.out.println("Enter options(1-3)");
		
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		switch(opt)
		{
		case 1:	{
					System.out.println("Enter new discount:");
					m.setDiscount(sc.nextDouble());
					m.findSellingPrice();
					break;
					
				}
		case 2: {
					System.out.println("Enter new vendor price:");
					m.setVendor_price(sc.nextDouble());
					m.findSellingPrice();
					break;
			
				}
		case 3: {
					System.out.println("Enter new MRP");
					m.setMRP(sc.nextDouble());
					m.findSellingPrice();
					break;
				}
		default: {
					System.out.println("Wrong option!");
					break;
				 }
		
		}
		sc.close();
		
		
	}

}
