package Database;

import Database.MySqlDatabase;

public class TestTrial {

	public static void main(String[] args) {
	
		MySqlDatabase test=new MySqlDatabase();
		
		if (test.connect("testuniversity", "root", "" ,"localhost" , 3306)) {
			
			System.out.println("Connected To Database...");
			
			System.out.println("     SELECT ACTION :    " );
			System.out.println(" 1- List Undergraduate Students :" );
			System.out.println(" 2- Add New Student : " );
			System.out.println(" 3- Delete A Student : " );
			System.out.println(" 4- Update A Student : ");
			
		}else {
			
			System.out.println("Not Connected");
		}

		

	}

}
