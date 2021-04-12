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
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
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
		boolean status=false;
		String network="jdbc:mysql://"+host+":"+port+"/"+dbName;
		try {
			connection=DriverManager.getConnection(network,userName,userPass);
			statement=connection.createStatement();
			status=true;
			
			//we can connect by this method between java and dataBase
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			status=false;
		}
		
		return status;
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
			number=statement.executeUpdate("insert into "+nameOftable+" ("+columns+") value ("+values+")");
			
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
		ResultSet rs =null;
		try {
			rs=statement.executeQuery(selectQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return rs;
	}

	@Override
	public boolean deleteData(String query) {
		// TODO Auto-generated method stub
		boolean b=false;
		try {
			statement.executeUpdate(query);
			b=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			b=false;
		}
		return b;
	}

	@Override
	public int deleteData(String nameOftable, String whereCondition) {
		// TODO Auto-generated method stub
		int number=0;
		try {
			number=statement.executeUpdate("delete from"+nameOftable+"where"+whereCondition);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			number=-1;
		}
		return number;
	}

	@Override
	public int updateDatad(String query) {
		// TODO Auto-generated method stub
		
		int number=0;
		try {
			number=statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			number=-1;
		}
		return number;
	}

	@Override
	public int updateData(String nameOftable, String update, String condition) {
		// TODO Auto-generated method stub
		
		int number=0;
		try {
			number=statement.executeUpdate("update"+nameOftable+"set"+update+"where"+condition);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			number=-1;
		}
		return number;
	}

	

	@Override
	public int totalNumberOftables() {
		int number=0;
		ResultSet rs=null;
		try {
			rs=statement.executeQuery("show tables");
			while(rs.next()) {
				number++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			number=-1;
		}
		
		
		// TODO Auto-generated method stub
		return number;
	}


	@Override
	public int totalNumberOfrows(String columns, String nameOftable) {
		int count=0;
		ResultSet rs;
		try {
			rs = statement.executeQuery("SELECT"+columns+"FROM"+nameOftable);
			
			while(rs.next()) {
				
				count++;
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			count=-1;
		}
	
			
	return count;
}


	@Override
	public int totalNumberOfrows(String nameOftable) {
		
			int count=0;
			ResultSet rs;
			try {
				rs = statement.executeQuery("SELECT COUNT(*)AS rowcount FROM"+nameOftable);
				rs.next();
				count =rs.getInt("rowcount");
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				count=-1;
			}
		
				
		return count;
	}
	

}
