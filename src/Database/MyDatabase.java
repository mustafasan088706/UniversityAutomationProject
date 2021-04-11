package Database;

import java.sql.ResultSet;

public abstract class MyDatabase {

	
	
public MyDatabase() {
	
}

	public abstract boolean connect (String sqliteDb);
	public abstract boolean connect(String dbName,String userName,String userPass,String host,int port);
	
	public abstract void disConnected();
	public abstract int addData(String insertQuery);
	public abstract int addData (String nameOftable,String columns,String values);
	public abstract ResultSet listOfvalues(String selectQuery);
	
	public abstract boolean deleteData(String query);
	public abstract int deleteData(String nameOftable,String whereCondition);
	public abstract int updateDatad(String query);
	public abstract int updateData(String nameOftable,String update,String condition);
	public abstract int totalNumberOfrows(String query);
	public abstract int totalNumberOftables();
	
	
}
