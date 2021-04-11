package Database;

import Database.MySqlDatabase;

public class TestTrial {

	public static void main(String[] args) {
	
		MySqlDatabase test=new MySqlDatabase();
		
		if (test.connect("testuniversity", "root", "" ,"localhost" , 3306)) {
			
			System.out.println("Connected To The Database...");
		}else {
			
			System.out.println("Not Connected");
		}

	}

}
