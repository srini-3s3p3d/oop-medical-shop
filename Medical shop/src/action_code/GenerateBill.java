/**
 * 
 */
package action_code;

import java.util.Scanner;
import classes.Bill;

/**
 * @author Srinivasan
 *
 */
public class GenerateBill {

	/**
	 * 
	 */
	public GenerateBill() {
		// TODO Auto-generated constructor stub
	}
	public void generate_bill()
	{
		System.out.println("Enter your requirements:");
		
		Scanner sc=new Scanner(System.in);
		//RunningClass rc=new RunningClass();
		
		System.out.println("Enter q to stop");
		String ch="n";
		int flag=1;
		do
		{
			System.out.println("Enter name of medicine:");
			String med_name=sc.next();
			System.out.println("Enter quantity required:");
			int qty_reqd=sc.nextInt();
			for(int i=0;i<RunningClass.med.size();i++)
			{
				if(RunningClass.med.get(i).getName().equals(med_name))
				{
					if(RunningClass.med.get(i).getQuantity()<qty_reqd)
					{
						flag=0;
					}
					System.out.println("Medicine updated successfully!");
					break;
				}
			}
		}while(!ch.equals("q") || flag==1);
		sc.close();
	}

}
