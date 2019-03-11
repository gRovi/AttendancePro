package EndModulo;
import java.sql.*;
import java.io.*;

public class DbConnection{
	private static Connection con = null;
	 static String driver = "com.mysql.jdbc.Driver";
	 static String connectionUrl = "jdbc:mysql://localhost:3306/Database";
	 static String userName = "root";
	 static String pwd = "P@$$w0d*";

	static {
		
			try{
				Class.forName(driver).newInstance();
				con=DriverManager.getConnection(connectionUrl, userName, pwd);
			}catch(Exception e){
				System.out.print(e);
			}
	}
	public static Connection getCon(){
		return con;
	}
}