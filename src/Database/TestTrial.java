package Database;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Database.MySqlDatabase;

public class TestTrial {
	
	public static void main(String[] args) {
	
		MySqlDatabase testValue=new MySqlDatabase();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter your username : ");
		String userName=scanner.next();
		System.out.println("Please enter your password :");
		String password=scanner.next();
		
		if("Admin".equalsIgnoreCase(userName)) {
			
			if("1234".equals(password)) {
				
				if(testValue.connect("testuniversity", "root", "" ,"localhost" , 3306 )){
					System.out.println("Connected To Database...");		
					
				
						
				while(true) {
					
					try {
						
					} catch (InputMismatchException e) {
						// TODO: handle exception
					}
					System.out.println("-----------------------------------");
					System.out.println("     SELECT ACTION :    " );
					System.out.println(" 1- List Undergraduate Students :" );
					System.out.println(" 2- Add New Student : " );
					System.out.println(" 3- Delete A Student : " );
					System.out.println(" 4- Update A Student : ");
					System.out.println("-----------------------------------");
					int select=scanner.nextInt();
					

					if(select==1) {
				
								ResultSet rs=testValue.listOfvalues("SELECT * FROM students");
						try {
							while(rs.next()) {
								
								int id=rs.getInt("id");
								String name=rs.getString("name");
								String surname=rs.getString("surname");
								Date dateofbirth=rs.getDate("dateofbirth");
								String birthplace=rs.getString("birthplace");
								String identificationnumber=rs.getString("identificationnumber");
								String telefonnumber=rs.getString("telefonnumber");
								String Adress=rs.getString("Adress");
								

								System.out.println(" ID : " + id);
								System.out.println(" NAME : " + name);
								System.out.println(" SURNAME : " + surname);
								System.out.println(" DATE OF BIRTH : " + dateofbirth);
								System.out.println(" BIRTHPLACE : " + birthplace);
								System.out.println(" IDENTIFICATION NUMBER :" + identificationnumber);
								System.out.println(" TELEPHONE : " + telefonnumber);
								System.out.println(" ADRESS  : " + Adress);
								System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
								
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						}
						
					}else if(select==2) {
						
						System.out.print( " Enter Students Name : " );
						String name=scanner.next();
						System.out.print( " Enter Students Surname : " );
						String surname=scanner.next();
						System.out.print( " Enter Students Date of Birth  : " );
						Date dateofbirth=Date.valueOf(scanner.next());
						System.out.print( " Enter Students Birth Place : " );
						String birthplace=scanner.next();
						System.out.print( " Enter Students identification Number : " );
						String identificationnumber=scanner.next();
						System.out.print( " Enter Students Telefon Number : " );
						String telefonnumber=scanner.next();
						System.out.print( " Enter Students Adress : " );
						String Adress=scanner.next();

						int value =testValue.addData("students", 
								"name, surname, dateofbirth, birthplace, identificationnumber, telefonnumber,Adress",
								"'"+name+"','"+surname+"','"+dateofbirth+"','"+birthplace+"','"+identificationnumber+"','"+telefonnumber+"','"+Adress+"'");
					
						if(value==0) {
							System.out.println( " Students Not Added! " );
						}else if (value==1){
							
							System.out.println( " Students Added!  " );
						}
						
					}else if(select==3) {
						
						System.out.println( " Enter Students ID For Delete From Database : " );
						
						int deleteValue=scanner.nextInt();
						
						if(testValue.deleteData("students", "id="+deleteValue)>0) {
							
							System.out.println(deleteValue + " Deleted! " );
						}else
						
							System.out.println( " Not Deleted ! " );
						
					}else if(select==4){
						
						System.out.println( " Enter ID Nummer for Update of Students Birthplace Information... " );
						int studentsId=scanner.nextInt();
						System.out.println( " Enter New Birthplace : " );
						String updateInfo =scanner.next();
						int n =testValue.updateData("students", "birthplace='"+updateInfo+"'", "id="+studentsId);
						
							if(n>0) {
								System.out.println( " Students Information Updated ! : " + updateInfo );
								
							}else
								System.out.println( " Not Updated ! " );
					}else
					{
						System.out.println("Not Valid Selection ! ");
						
					}
					
					System.out.println("Either don't you want to go on to writing (break)  or you can push by any character! ");
					
					String value=scanner.next();
					if("break".equalsIgnoreCase(value)) {
						break;
						
					}
				}
				
					
					}else {
						System.out.println("Not Connected !");
					}
					
			}else
				System.out.println("NOT VALID !");
		
		}else {
			
			System.out.println("NOT VALID ! ");
		}
		
		
		
	}

}