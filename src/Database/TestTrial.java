package Database;

import java.util.Scanner;

import Database.MySqlDatabase;

public class TestTrial {

	public static void main(String[] args) {
	
		MySqlDatabase test=new MySqlDatabase();
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Please enter your username : ");
		String userName=scanner.next();
		System.out.println("Please enter your password :");
		String password=scanner.next();
		if(userName.equals("Admin")) {
			
			if(password.equals("1234")) {
				
				 test.connect("testuniversity", "root", "" ,"localhost" , 330 );
					
					System.out.println("Connected To Database...");
					
					System.out.println("     SELECT ACTION :    " );
					System.out.println(" 1- List Undergraduate Students :" );
					System.out.println(" 2- Add New Student : " );
					System.out.println(" 3- Delete A Student : " );
					System.out.println(" 4- Update A Student : ");
					
					int select=scanner.nextInt();
					
					switch (select) {
					case 1:
						
							break;
						case 2:
						
								break;
							case 3:
						
									break;
								case 4:
						
										break;

					default:
						break;
					}
				
			
			}

				
			}
			
	
					else {
			
			System.out.println("Not Connected!");
			System.out.println("Password or Username is not Correct!");
		}

	}

}
