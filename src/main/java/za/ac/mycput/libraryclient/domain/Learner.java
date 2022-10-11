/* Learner.java
   This is the model class
   Author: Zukhanye Anele Mene
   Date: 26 September 2022 */
package za.ac.mycput.libraryclient.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Learner {
    
     static final String DATABASE_URL = "jdbc:derby://localhost:1527/DaleLibraryDB2022";
     private  static final String Username = "Administrator";
     private static final String Password = "Password" ;
    
    private String studentNumber;
    private boolean canBorrow;
    

    public Learner() {
    }

    public Learner(String studentNumber, boolean canBorrow) {
        this.studentNumber = studentNumber;
        this.canBorrow = canBorrow;
        
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public boolean getCanBorrow() {
        return canBorrow;
    }

    

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setcanBorrow(boolean canBorrow) {
        this.canBorrow = canBorrow;
    }

   

    @Override
    public String toString() {
        return "Learner{" + "studentNumber=" + studentNumber + ", canBorrow=" + canBorrow +  '}';
        
        
    }
    
    
    public boolean save(){
         Connection connection = null ; //manage connections
                Statement statement = null ;    // query statement
                int ok;
                boolean success = true;
              
               try { 
                   //establish connection to database
                   connection = DriverManager.getConnection(DATABASE_URL , Username , Password);
                   //creating statement for quering database
                   statement = connection.createStatement();
                   
                   ok = statement.executeUpdate("INSERT INTO  Learner VALUES('" + studentNumber + "' , '" + canBorrow +  "')");
                   if (ok > 0){
                       JOptionPane.showMessageDialog(null , "Suscess! Learner is added");
                       System.exit(0);
               }
                   else {
                       JOptionPane.showMessageDialog(null , "Error: could not add learner");
                       success = false;

                   }
                }
               catch (SQLException sqlException){
                   JOptionPane.showMessageDialog(null  , "Error: could not add learner" + sqlException);
                   success = false;
               }
                 
               catch (Exception exception){
                   JOptionPane.showMessageDialog(null , "Error: could not add learner" + exception);
                   success = false;
               }
               
               finally{
               try {
               if (statement != null)
                   statement.close();
               }
               catch(Exception exception){
               JOptionPane.showMessageDialog(null , exception.getMessage(), "Warning" , JOptionPane.ERROR_MESSAGE);
               success = false;
               }
               try {
               if (connection != null)
                   connection.close();
               }
               catch(Exception exception){
               JOptionPane.showMessageDialog(null , exception.getMessage(), "Warning" , JOptionPane.ERROR_MESSAGE);
               success = false;
               }
            }
            return success;
    }
     public boolean isStudentNumberUnique(){
    
        Connection connection = null;
        Statement  statement = null;
        ResultSet resultSet = null;
        boolean unique = false; 
        
         
            try { 
                   //establish connection to database
                   connection = DriverManager.getConnection(DATABASE_URL , Username , Password);
                   //creating statement for quering database
                   statement = connection.createStatement();
                   
                   resultSet = statement.executeQuery("SELECT * FROM Learner WHERE studentNumber = '" + studentNumber + "'");
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
