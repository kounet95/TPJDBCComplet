package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
private static Connection connection;
static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/SCOLARITE","root","");
		
	} catch (Exception e) {
	
	}
}
public static Connection getConnection() {
	return connection;
}
public static void setConnection(Connection connection) {
	SingletonConnection.connection = connection;
}

}
