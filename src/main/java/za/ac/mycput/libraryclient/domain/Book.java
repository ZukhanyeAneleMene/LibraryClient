/* Book.java
   This is the model class
   Author: Zukhanye Anele Mene
   Date: 26 September 2022 */
package za.ac.mycput.libraryclient.domain;

import java.io.Serializable;


public class Book implements Serializable{
    
    
    private String isbn;
    private String title;
    private String edition;
    private String rating;
    private String auther;
    private String fiction;
    private String availableForLoan;

    public Book() {
    }

    public Book( String isbn, String title, String edition, String rating, String auther, String fiction, String availableForLoan) {
        
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
        this.rating = rating;
        this.auther = auther;
        this.fiction = fiction;
        this.availableForLoan = availableForLoan;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getEdition() {
        return edition;
    }

    public String getRating() {
        return rating;
    }

    public String getAuther() {
        return auther;
    }

    public String getFiction() {
        return fiction;
    }

    public String getAvailableForLoan() {
        return availableForLoan;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setFiction(String fiction) {
        this.fiction = fiction;
    }

    public void setAvailableForLoan(String availableForLoan) {
        this.availableForLoan = availableForLoan;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", edition=" + edition + ", rating=" + rating + ", auther=" + auther + ", fiction=" + fiction + ", availableForLoan=" + availableForLoan + '}';
    }

   
    
    
    
}
