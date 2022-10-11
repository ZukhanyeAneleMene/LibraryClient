/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.libraryclient.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import za.ac.mycput.libraryclient.domain.Learner;

/**
 *
 * @author CPUT
 */
public class LearnerGui extends JFrame implements ActionListener{
    
    private JPanel panelNorth , panelCenter, panelSouth, panelRB1, panelRB2;
    private JLabel lblHeading, lblStudentNumber, lblCanBorrow;
    private JTextField txtStudentNumber;
    private JRadioButton radYes;
    private JRadioButton radNo; 
    private ButtonGroup btnGroup;
    private JButton btnSave, btnReset, btnExit;
    private Font ft1, ft2, ft3;
    
    public void setGui(){
             
             this.add(panelNorth, BorderLayout.NORTH);
             this.add(panelCenter, BorderLayout.CENTER);
             this.add(panelSouth, BorderLayout.SOUTH);
             this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             
             panelNorth.setLayout(new FlowLayout());
             panelCenter.setLayout(new GridLayout (5, 2));
             panelRB1.setLayout(new GridLayout (1, 2));
             panelRB2.setLayout(new GridLayout (1, 2));
             panelSouth.setLayout(new GridLayout (1,3 ));
             this.setSize(600,600);
             this.pack();
             this.setVisible(true);
             
             panelNorth.add(lblHeading);
             lblHeading.setFont(ft1);
             lblHeading.setForeground(Color.yellow);
             panelNorth.setBackground(new Color(0, 106, 255));
             
             lblStudentNumber.setFont(ft2);
             lblStudentNumber .setHorizontalAlignment(JLabel.RIGHT);
             lblStudentNumber.setFont(ft2);
             panelCenter.add(lblStudentNumber );
             panelCenter.add(txtStudentNumber );
             
             lblCanBorrow.setFont(ft2);
             lblCanBorrow .setHorizontalAlignment(JLabel.RIGHT);
             radYes.setFont(ft2);
             radYes .setHorizontalAlignment(JRadioButton.CENTER);
             radYes.setBackground(new Color(36, 145, 255));
             radNo.setFont(ft2);
             radNo .setHorizontalAlignment(JRadioButton.CENTER);
             radNo.setBackground(new Color(36, 145, 255));
             radYes.setSelected(true);
             
             
             btnGroup.add(radYes);
             btnGroup.add(radNo);

             panelCenter.add(lblCanBorrow);
             panelRB1.add(radYes);
             panelRB1.add(radNo);
             panelCenter.add(panelRB1);
             
             btnSave.setFont(ft3);
             btnReset.setFont(ft3);
             btnExit.setFont(ft3);
             panelSouth.add(btnSave);
             panelSouth.add(btnReset);
             panelSouth.add(btnExit);
             
             
             btnSave.addActionListener(this);
             btnReset.addActionListener(this);
             btnExit.addActionListener(this);
             
             
    }
    
    public LearnerGui(){
     
        super("Dale Primary Library App version 1.0");
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        panelRB1 = new JPanel();
        panelRB2 = new JPanel();
        
        lblHeading = new JLabel("Dale Primary System");
        
        lblStudentNumber = new JLabel("Student Number : ");
        lblCanBorrow = new JLabel("Borrow Book? : ");
        
        txtStudentNumber = new JTextField ();
        
        radYes = new JRadioButton("Yes");
        radNo = new JRadioButton("No");
        btnGroup = new ButtonGroup();
        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");
        btnExit = new JButton("Exit");
       
        ft1 = new Font("Ariel", Font.BOLD, 32);
        ft2 = new Font("Ariel", Font.BOLD, 22);
        ft3 = new Font("Ariel", Font.BOLD, 24);
        
    }
        
    public boolean isInputValid(){
        boolean valid = true;
        
        if (txtStudentNumber.getText().equals("")){
            valid = false;
         }
        
       
        return valid;
         }
     
     public void resetForm(){
        
        txtStudentNumber.setText(" ");
        radYes.setSelected(true);
        
        }
          @Override   
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == btnSave){
                //Save to the database
                if (isInputValid()){
                    Learner  u = new Learner ( 
                    txtStudentNumber.getText(),
                    radYes.isSelected());
                    //System.out.println("x: "+x );
                    // new Learner(str1, str2)
                u.save();
                resetForm();
            }
            }
             else if (e.getSource() == btnReset) {
               resetForm();
            }
                else if (e.getSource() == btnExit) {
                 System.exit(0);
            }
             
            
            }
        
        public static void main(String[] args){
     
         LearnerGui gui = new LearnerGui();
        gui.setGui();
     }
}
