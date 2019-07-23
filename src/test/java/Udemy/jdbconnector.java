package Udemy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbconnector {

    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";
       Connection cn = DriverManager.getConnection("jdbc:mysql://" + host+ ":" + port + "/iedbt","root","root");

        Statement s = cn.createStatement();
        s.executeQuery("");
    }
}
