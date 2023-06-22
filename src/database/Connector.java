package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    private final static String connectionString = "jdbc:mysql://localhost:3306/t2210a_jp";
    private final static String user = "root";
    private final static String pwd = "root";// xampp: ""  mamp: "root"

    private Connection conn;

    public Connector() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection(connectionString,user,pwd);
    }

    public Connection getConn() {
        return conn;
    }
}