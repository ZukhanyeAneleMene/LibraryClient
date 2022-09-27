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
public class Librarian {
    
    private String librarianId;
    private String name;
    private String surname;

    public Librarian() {
    }

    public Librarian(String librarianId, String name, String surname) {
        this.librarianId = librarianId;
        this.name = name;
        this.surname = surname;
    }

    public String getLibrarianId() {
        return librarianId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Librarian{" + "librarianId=" + librarianId + ", name=" + name + ", surname=" + surname + '}';
    }
    
    
}
