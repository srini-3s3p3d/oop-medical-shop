/**
 * Running class
 * 
 */
package action_code;
import classes.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Srinivasan V
 *
 */
public class RunningClass {

	/**
	 * My tasks:
	 * 
	 * 
	 * 
	 */
	public static ArrayList<Medicine> med=new ArrayList<Medicine>();		//Array of medicine objects created
	public static ArrayList<String> med_cat=new ArrayList<>();			//List of medicine categories
	
	
	public RunningClass() {
		// TODO Auto-generated constructor stub
		med_cat.add("");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		
		
		
		
		Scanner sc=new Scanner(System.in);					//Scanner object to get input
		System.out.println("/t/tOOP Project 2017-18");
		System.out.println("Medical Shop Management System");
		System.out.println();
		int choice=0;
		int cat_no;
		System.out.println("Please enter a choice of action");
		String cont="y";
		do
		{
			System.out.println("Menu\n");
			System.out.println("1. Add a medicine");
			System.out.println("2. Update a medicine");
			System.out.println("3. Display a category of medicines in stock");
			System.out.println("4. Buy medicine");
			System.out.println("5. Generate details of a customer");
			System.out.println("6. Display summary of invoices(requires start bill no and end bill no:)");
			System.out.println();
			System.out.println("Enter a choice(1-6)");
			choice=sc.nextInt();
			if(choice<1 || choice>6) 
			{
				System.out.println("Wrong choice!");
				System.out.println("Try again");
				continue;
			}
			switch(choice)
			{
			case 1: {
						Medicine tmp=new Medicine();			//Create a temporary medicine object
						AddMedicine ad=new AddMedicine();		//Object to call Addmedicine class functions
						ad.addmedicine(tmp);					//Calling function to add medicine
						med.add(tmp);							//Adding the object to arraylist of medicines
						System.out.println("Medicine successfully added!");
						break;
					}
					
			case 2: {
						System.out.println("Enter the name of medicine please:");
						String med_name=sc.next();
						UpdateMedicine upd=new UpdateMedicine();
						for(int i=0;i<med.size();i++)
						{
							if(med.get(i).getName().equals(med_name))
							{
								upd.updatemed(med.get(i));
								System.out.println("Medicine updated successfully!");
								break;
							}
						}
						break;
					}
			
			
			case 3: {
						System.out.println("The categories of medicines are:");
						for(int i=0;i<med_cat.size();i++)
						{
							System.out.println("Category "+(i+1)+" : "+med_cat.get(i));
						}
						System.out.println("Enter category no:");
						cat_no=sc.nextInt();
						for(int i=0;i<med.size();i++)
						{
							if(med.get(i).getCategory().equals(med_cat.get(cat_no-1)))
							{
								System.out.println("Name of medicine: "+med.get(i).getName());
								System.out.println("Code no of medicine: "+med.get(i).getCode());
								System.out.println("Quantity of medicine: "+med.get(i).getQuantity());
								System.out.println("\n");
							}
						}
						break;
					}
			
			
			case 4: {
						System.out.println("Calling the class to generate bill: ");
						GenerateBill gb=new GenerateBill();
						gb.generate_bill();
						break;
					}
			
			
			case 5: System.out.println("Generating details of a customer: ");
			break;
			
			case 6: System.out.println("Enter start and end bill numbers:");
			break;
			
			default: System.out.println("Wrong choice!!!!!");
			break;
					
			
			}
			
			System.out.println("Do you want to do another operation?(Press y to continue or n to quit)");
			cont=sc.next();
			
		}while(cont=="y");
		
		System.out.println("Thank you!");
		System.out.println();
		System.out.println("\t\tDO VISIT AGAIN!");
		System.out.println();
		sc.close();
	}

}
