/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Amarnath s p
 */
public class Dbconnect {
public Connection connect(){
    Connection con=null;

    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/lbad","root","");
        
}catch(Exception e)
{
    System.out.println(e);
}
 return con;
}
}