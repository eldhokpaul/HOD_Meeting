/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HodWebservice;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ruban
 */
public class Dbconnect {
    
    
    Connection con=null;
    public Connection connect()
    {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/hod_meeting","root","root");
           
       } 
       catch(Exception e)
               {
                   System.out.println("Exception"+e);
               }
       return con;
    }
    
}
