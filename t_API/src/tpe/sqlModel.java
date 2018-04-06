package tpe;

public class sqlModel {

	public String getCreateSql() {
		String sql = "CREATE TABLE tbuser " + "(ID INT PRIMARY KEY     NOT NULL,"
				+ " NAME           TEXT    NOT NULL, " + " AGE            INT     NOT NULL, "
				+ " ADDRESS        CHAR(50), " + " SALARY         REAL)";
		return sql;

	}

	public String getInsertSql() {
		String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
				+ "VALUES (1, 'Paul', 32, 'California', 20000.00 )";
		return sql;
	}

	public String getDeleteSql() {
		String sql = "DELETE from COMPANY where ID = 2;";
		return sql;
	}

	public String getUpdateSql() {

		String sql = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";
		return sql;

	}

	public String getSearchSql() {
		String sql = "SELECT * FROM COMPANY";

		return sql;

	}
}
