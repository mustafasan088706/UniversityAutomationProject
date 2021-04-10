package Database;

import java.sql.ResultSet;

public class MySqlDatabase extends MyDatabase{

	@Override
	public boolean connect(String sqliteDb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean connect(String dbName, String userName, String userPass, String host, int port) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void disConnected() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addData(String insertQuery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addData(String nameOftable, String columns, String values) {
		// TODO Auto-generated method stub
		return 0;
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
