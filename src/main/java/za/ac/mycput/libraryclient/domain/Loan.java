/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.libraryclient.domain;

/**
 *
 * @author CPUT
 */
public class Loan {
    
    private String loanNumber;
    private String studentNumber;
    private String isbn;
    private double penaltyCost;
    private boolean bookBorrowed;
    private boolean bookReturned;

    public Loan() {
    }

    public Loan(String loanNumber, String studentNumber, String isbn, double penaltyCost, boolean bookBorrowed, boolean bookReturned) {
        this.loanNumber = loanNumber;
        this.studentNumber = studentNumber;
        this.isbn = isbn;
        this.penaltyCost = penaltyCost;
        this.bookBorrowed = bookBorrowed;
        this.bookReturned = bookReturned;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPenaltyCost() {
        return penaltyCost;
    }

    public boolean isBookBorrowed() {
        return bookBorrowed;
    }

    public boolean isBookReturned() {
        return bookReturned;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPenaltyCost(double penaltyCost) {
        this.penaltyCost = penaltyCost;
    }

    public void setBookBorrowed(boolean bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }

    public void setBookReturned(boolean bookReturned) {
        this.bookReturned = bookReturned;
    }

    @Override
    public String toString() {
        return "Loan{" + "loanNumber=" + loanNumber + ", studentNumber=" + studentNumber + ", isbn=" + isbn + ", penaltyCost=" + penaltyCost + ", bookBorrowed=" + bookBorrowed + ", bookReturned=" + bookReturned + '}';
    }
    
    public void bookBorrowed(){
    
    }
    
     public void bookReturned(){
    
    }
     
     public void penaltyCost(){
    
    }
     
     
}
