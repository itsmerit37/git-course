package org.example;
import java.sql.*;

public class DemoClass {
    public static void main(String[] args) throws Exception{
        String url="";
        String uMame="root";
        String password="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uMame,password);



        }
}