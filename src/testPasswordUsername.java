import java.util.Scanner;



public class testPasswordUsername {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testUsername="Admin";
		String testPassword="1234";
		
		do {
			
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter Username : ");
			String username=scanner.next();
			System.out.println("Enter Password :");
			String password=scanner.next();
			
	        if(!testUsername.equals(username) && !testPassword.equals(password)) {
				
				System.out.println("Not Valid!");
			}
			
			else	{
				
				break;
			}		
				
		}while(true);
		
		System.out.println("Valid!");
		
		
	}

}
