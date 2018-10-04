/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Index;

import java.sql.Connection;
import java.sql.DriverManager;
import loginPage.loginPage;

/**
 *
 * @author Atharva
 */
public class index {
    private Connection conn;
    public index(){
        String url = "jdbc:derby://localhost:1527/";
        String dbName = "Inventory";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "inv";
        String password = "inv";
        try {
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url+dbName,userName,password);
        System.out.println("Connected to the database");
        } catch (Exception se)
        {
            System.out.println(se);
        }
    }
    public Connection getconn(){
        return conn;
    }
    public static void main(String[] args) {
        new loginPage().setVisible(true);
    }
}
