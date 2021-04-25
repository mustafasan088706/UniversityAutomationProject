
/**
 * 
 * This method make a selection for users.
 */


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Testdowhile {

	public static void main(String[] args) {
		
		int select=0;
		Scanner scanner=new Scanner(System.in);
				
		while(select!=5) {
		System.out.println("--------------------------------------------------------");
		System.out.println("     SELECT ACTION :    " );
		System.out.println(" 1- List Undergraduate Students :" );
		System.out.println(" 2- Add New Student : " );
		System.out.println(" 3- Delete A Student : " );
		System.out.println(" 4- Update A Student : ");
		System.out.println(" 5- Exit : ");
		System.out.println("--------------------------------------------------------");
		
		select=scanner.nextInt();
		
		if (select==1) {
			
			System.out.println("1- Selected Undergraduate Students List : ");
			
		}else if (select==2) {
			
			System.out.println("2- Selected Student Adding : ");
			
			
		}else if(select==3) {
			
			
			System.out.println("3- Selected Studend Deleting : ");
			
		}else if(select==4) {
			
			
			System.out.println("1- Selected Student Updating :");
			
		}else if(select==5) {
				
			System.out.println( " EXIT ! " );
			
					
			
		}else {
			
			System.out.println("Invalid!");
		}
		
	}
		
		

	}

}
