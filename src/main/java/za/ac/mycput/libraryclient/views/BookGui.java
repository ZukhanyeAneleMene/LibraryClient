
package za.ac.mycput.libraryclient.views;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BookGui extends JFrame implements ActionListener {
    // North Panel
    private JPanel pnlNorth;
    private JLabel lblHeading;
    
    // Center Panel
    private JPanel pnlCenter;
    private JLabel lblBookId;
    private JLabel lblIsbn;                // -> primary key
    private JLabel lblTitle;               // -> textField
    private JLabel lblEdition;             // -> textField
    private JLabel lblAuthor;              // -> textField
    private JLabel lblFiction;             // combobox -> allows you to choose the genre of book want
    private JLabel lblAvailability;    
    /* YES/NO -> checks database if book is available
    IF BOOK IS NOT AVAILABLE -> the user shouldnt be allowed to take out book */
    
    private JTextField txtBookId;
    private JTextField txtIsbn;
    private JTextField txtTitle;
    private JTextField txtEdition;
    private JTextField txtAuthor;
    private JComboBox cmbFiction;
    private JRadioButton rbnYes;
    private JRadioButton rbnNo;
    private ButtonGroup btnGroup;
    private JPanel pnlButton;
    
    // South Panel
    private JPanel pnlSouth;
    private JButton btn1;
    private JButton btnClear;
    private JButton btnExit;
    
    public BookGui() {
        super("Book GUI");
        pnlNorth = new JPanel();
        lblHeading = new JLabel("Book GUI");
        
        pnlCenter = new JPanel();
        lblBookId = new JLabel("Book ID: ");
        lblIsbn = new JLabel("ISBN Number: ");
        lblTitle = new JLabel("Title: ");
        lblEdition = new JLabel("Edition: ");
        lblAuthor = new JLabel("Author: ");
        lblFiction = new JLabel("Fiction: ");
        lblAvailability = new JLabel("Book Availability: ");
        
        // ***NB -> add these to panel Center
        txtBookId = new JTextField();
        txtIsbn = new JTextField();
        txtTitle = new JTextField();
        txtEdition = new JTextField();
        txtAuthor = new JTextField();
        cmbFiction = new JComboBox();
        
        // BUTTON GROUP
        rbnYes = new JRadioButton("Yes");
        rbnNo = new JRadioButton("No");
        btnGroup = new ButtonGroup();
        btnGroup.add(rbnYes);
        btnGroup.add(rbnNo);
        
        pnlButton = new JPanel();
        pnlButton.setLayout(new GridLayout(1,2));
        pnlButton.add(rbnYes);
        pnlButton.add(rbnNo);
        
        pnlSouth = new JPanel();
        btn1 = new JButton("Add Books");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Return");
    }
    
    public void setGUI() {
        this.add(pnlNorth, BorderLayout.NORTH);
        pnlSouth.setLayout(new GridLayout(1,1));
        pnlNorth.add(lblHeading);
        this.add(pnlCenter, BorderLayout.CENTER);
        pnlCenter.setLayout(new GridLayout(7,2));
        pnlCenter.add(lblBookId);
        pnlCenter.add(txtBookId);
        pnlCenter.add(lblIsbn);
        pnlCenter.add(txtIsbn);
        pnlCenter.add(lblTitle);
        pnlCenter.add(txtTitle);
        pnlCenter.add(lblEdition);
        pnlCenter.add(txtEdition);
        pnlCenter.add(lblAuthor);
        pnlCenter.add(txtAuthor);
        pnlCenter.add(lblFiction);
        pnlCenter.add(cmbFiction);
        pnlCenter.add(lblAvailability);
        pnlCenter.add(pnlButton);
        
        this.add(pnlSouth, BorderLayout.SOUTH);
        pnlSouth.setLayout(new GridLayout(1,3));
        pnlSouth.add(btn1);
        pnlSouth.add(btnClear);
        pnlSouth.add(btnExit);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        
        btn1.addActionListener(this);
        btnClear.addActionListener(this);
        btnExit.addActionListener(this);
    } 
    
    public void clearFields() {
        txtBookId.setText("");
        txtIsbn.setText("");
        txtTitle.setText("");
        txtEdition.setText("");
        txtAuthor.setText("");
        //cmbFiction.setSelectedIndex(0);
        
        rbnNo.setSelected(false);
        rbnYes.setSelected(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            
        } else if (e.getSource() == btnClear) {
            clearFields();
        } else if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        BookGui book12 = new BookGui();
        book12.setGUI();
    }
}