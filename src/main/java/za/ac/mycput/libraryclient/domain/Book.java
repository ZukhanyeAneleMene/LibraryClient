/* Book.java
   This is the model class
   Author: Zukhanye Anele Mene
   Date: 26 September 2022 */
package za.ac.mycput.libraryclient.domain;

import java.io.Serializable;


public class Book implements Serializable{
    
    private String bookId;
    private String isbn;
    private String title;
    private String edition;
    private String rating;
    private String publishedDate;
    private String publisherId;

    public Book() {
    }

    public Book(String bookId, String isbn, String title, String edition, String rating, String publishedDate, String publisherId) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
        this.rating = rating;
        this.publishedDate = publishedDate;
        this.publisherId = publisherId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getBookId() {
        return bookId;
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

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getPublisherId() {
        return publisherId;
    }

    @Override
    public String toString() {
        return "Book{" + "bookId=" + bookId + ", isbn=" + isbn + ", title=" + title + ", edition=" + edition + ", rating=" + rating + ", publishedDate=" + publishedDate + ", publisherId=" + publisherId + '}';
    }
    
    
    
}
