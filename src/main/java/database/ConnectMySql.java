package database;

import org.testng.annotations.Test;


import java.sql.*;

public class ConnectMySql {
    @Test
    public void testDB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","nouran1234");
        System.out.println("Connected to my sql database");
        Statement smt= con.createStatement();
        ResultSet rs =smt.executeQuery("select* from survey");
        while (rs.next()){
           int id =rs.getInt(0);
            System.out.println(id);
            String survey_name=rs.getString("survey-name");
            System.out.println("survey_name");
        }

    }
}
