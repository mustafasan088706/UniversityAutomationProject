package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDatabase extends MyDatabase{
	
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset =null;
	
	
	
	
	public MySqlDatabase() {
	try {
		Class.forName("com.mysql.cj.jdbc"); //we have selected our db type.
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

	
	@Override
	public boolean connect(String sqliteDb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean connect(String dbName, String userName, String userPass, String host, int port) {
		// TODO Auto-generated method stub
		boolean b=false;
		String network="jdbc:mysql://"+host+":"+port+"/"+dbName;
		try {
			connection=DriverManager.getConnection(network,userName,userPass);
			statement=connection.createStatement();
			b=true;
		
			//we can connect by this method between java and dataBase
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			b=false;
		}
		
		return false;
	}

	@Override
	public void disConnected() {
		// TODO Auto-generated method stub
		
		try {
			if (statement.isClosed()==false) {
				
				statement.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		try {
			if (connection.isClosed()==false) {
				connection.isClosed();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

	@Override
	public int addData(String insertQuery) {
		// TODO Auto-generated method stub
		
		int number=0;
		try {
			number = statement.executeUpdate(insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			number=-1;
		}
		
		return number;
	}

	@Override
	public int addData(String nameOftable, String columns, String values) {
		
		int number=0;
		
		try {
			statement.executeUpdate("insert info"+nameOftable+"(" +columns+") values("+values+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			number=-1;
		}
		return number;
	}

	@Override
	public ResultSet listOfvalues(String selectQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteData(String query) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int deleteData(String nameOftable, String whereCondition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDatad(String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateData(String nameOftable, String update, String condition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalNumberOfrows(String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalNumberOftables() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
