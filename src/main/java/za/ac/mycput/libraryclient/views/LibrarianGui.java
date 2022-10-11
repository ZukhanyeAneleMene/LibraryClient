/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.libraryclient.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import za.ac.mycput.libraryclient.domain.Librarian;
/**
 *
 * @author CPUT
 */
public class LibrarianGui extends JFrame implements ActionListener{
    
     private JPanel panelWest, panelEast, panelSouth;
    private JLabel lblEmail, lblPassword;
    private JTextField txtEmail, txtPassword;
    private JButton btnLogin, btnCancel;
    
    public LibrarianGui(){
    
        super("User Authentication");
        panelWest = new JPanel();
        panelEast = new JPanel();
        panelSouth = new JPanel();
        lblEmail = new JLabel("Email: ");
        lblPassword = new JLabel("Password: ");
        txtEmail = new JTextField ();
        txtPassword = new JTextField ();
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
    }
    
    public void setGui(){
    
         this.add(panelWest, BorderLayout.WEST);
             this.add(panelEast, BorderLayout.EAST);
             this.add(panelSouth, BorderLayout.SOUTH);
             
           
             panelWest.setLayout(new GridLayout (2, 1));
             panelEast.setLayout(new GridLayout (2, 1));
             panelSouth.setLayout(new GridLayout (1, 2));
             panelEast.setPreferredSize (new Dimension (250,90));
             panelSouth.setPreferredSize (new Dimension (200,30));
             this.setSize(400,120);
             this.setVisible(true);
             panelWest.add(lblEmail );
             panelWest.add(lblPassword );
             panelEast.add(txtEmail );
             panelEast.add(txtPassword);
             panelSouth.add(btnLogin);
             panelSouth.add(btnCancel);
             btnLogin.addActionListener(this);
             btnCancel.addActionListener(this);
    }
    
     @Override
     public void actionPerformed(ActionEvent e){
            if (e.getSource() == btnLogin){
                //Save to the database 
                String email = txtEmail.getText();
                String password = String.valueOf(txtPassword.getText());
                
               Librarian s = new Librarian (email,  password);
               if (Librarian.authenticate(s)){
                 JOptionPane.showMessageDialog(this, "Welcome Librarian"  );
                   System.exit(0);
                 
                }
               else
               JOptionPane.showMessageDialog(this, "This email/password is incorect");
                txtEmail.hasFocus();
               // txtSubjectCode.setText(""); //this  delete every user input that is wrong
            }
            
            else if (e.getSource() == btnCancel){
                System.exit(0);
                
            }
        }
    
      public static void main(String[] args) {
        
    LibrarianGui gui = new LibrarianGui();
        gui.setGui();
    
    }
}
