package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		
		if (conn == null) {
			Properties props = LoadProperties();
			String url = props.getProperty("dburl");
			conn = DriverManager.getConnection(url, props);
		}
		return conn;
	}
	
	private static Properties loadProperties() {
		
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} 
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}		
	}
}
