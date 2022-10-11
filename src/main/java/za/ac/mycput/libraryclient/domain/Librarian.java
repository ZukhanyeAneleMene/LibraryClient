/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.libraryclient.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CPUT
 */
public class Librarian {
    
    private static  final String DATABASE_URL = "jdbc:derby://localhost:1527/DaleLibraryDB2022";
    private static final String username = "Administrator";
    private static final String Password = "Password" ;
    
    private static String email;
    private static String password;

    public Librarian() {
    }

    public Librarian( String email, String password) {
        this.email = email;
        this.password = password;
        
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    @Override
    public String toString() {
        return "Librarian{" + "email=" + email + ", name=" + password + '}';
    }
    
    public void set (String email, String password){
    
         Librarian.email = email;
        Librarian.password = password;
        
    }
    
    public static boolean authenticate(Librarian librarian){
     
        boolean valid = true; 
        
         Connection connection = null;
         PreparedStatement  statement = null;
        ResultSet resultSet = null;
        
        String sql = "SELECT * FROM Librarian WHERE email = ? AND password =?";
      
        
         try { 
                   //establish connection to database
                   connection = DriverManager.getConnection(DATABASE_URL , username , Password);
                   //creating statement for quering database
                   statement = connection.prepareStatement(sql);
                   statement.setString(1, librarian.getEmail());
                   statement.setString(2, librarian.getPassword());
                   
                   resultSet = statement.executeQuery();
                   if (resultSet.next()){
                       librarian.set(resultSet.getString(1),resultSet.getString(2));
                       
                   }
            }
              catch(SQLException sqlException){
               JOptionPane.showMessageDialog(null ,  "Error" + sqlException);
              }
              
            finally{
                //Method 1
               try {
               if (resultSet != null)
                   resultSet.close();
               }
               catch(Exception exception){
               JOptionPane.showMessageDialog(null , exception.getMessage(), "Warning" , JOptionPane.ERROR_MESSAGE);
               }
                try {
               if (statement != null)
                   statement.close();
               }
               catch(Exception exception){
               JOptionPane.showMessageDialog(null , exception.getMessage(), "Warning" , JOptionPane.ERROR_MESSAGE);
               }
               try {
               if (connection != null)
                   connection.close();
               }
               catch(Exception exception){
               JOptionPane.showMessageDialog(null , exception.getMessage(), "Warning" , JOptionPane.ERROR_MESSAGE);
               
               }
            }
            return valid;
    }
    
     public boolean isUniqueEmail(String email, String password
     ){
    
        Connection connection = null;
        Statement  statement = null;
        ResultSet resultSet = null;
        boolean unique = false; 
        
         
            try { 
                   //establish connection to database
                   connection = DriverManager.getConnection(DATABASE_URL , username , Password);
                   //creating statement for quering database
                   statement = connection.createStatement();
                   
                   resultSet = statement.executeQuery("SELECT * FROM Librarian WHERE email , password = '" + email + "' + '" + password + "'");
                   if (!resultSet.next()){
                       //JOptionPane.showMessageDialog(null , "Suscess! the subject is added");
                       unique = true;
                       
                       
                       
                       
               }
            }
              catch(SQLException sqlException){
               JOptionPane.showMessageDialog(null ,  "Error" + sqlException);
              }
              
            finally{
                //Method 1
               try {
               if (resultSet != null)
                   resultSet.close();
               }
               catch(Exception exception){
               JOptionPane.showMessageDialog(null , exception.getMessage(), "Warning" , JOptionPane.ERROR_MESSAGE);
               }
                try {
               if (statement != null)
                   statement.close();
               }
               catch(Exception exception){
               JOptionPane.showMessageDialog(null , exception.getMessage(), "Warning" , JOptionPane.ERROR_MESSAGE);
               }
               try {
               if (connection != null)
                   connection.close();
               }
               catch(Exception exception){
               JOptionPane.showMessageDialog(null , exception.getMessage(), "Warning" , JOptionPane.ERROR_MESSAGE);
               
               }
            }
            return unique;
    }
}
