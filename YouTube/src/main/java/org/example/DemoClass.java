package org.example;
import java.sql.*;

public class DemoClass {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/aliens";
        String uName="root";
        String password="root";
        String query= "select name from student where userid=1";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uName,password);
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(query);

        rs.next();
        String name=rs.getString("name");
        System.out.println(name);
        st.close();
        con.close();



        }
}