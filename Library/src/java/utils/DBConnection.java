/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mateusz
 */
public class DBConnection {
    
    private Connection con = null;
    
    public Connection getMySQLConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        Class.forName("org.gjt.mm.mysql.Driver").newInstance();
        this.con = (Connection) DriverManager.getConnection("jdbc:mysql://jbossas-mkjavalibrary.rhcloud.com", "Testowy", "Test123");
        
        return this.con;
    }
}
