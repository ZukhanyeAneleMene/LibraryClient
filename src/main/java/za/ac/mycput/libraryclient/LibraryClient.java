/* LibraryClient.java
   This is the client program
   Author: Zukhanye Anele Mene
   Date: 15 September 2022 */

package za.ac.mycput.libraryclient;

import java.awt.print.Book;
import java.net.*;
import java.io.*;

public class LibraryClient{
    public static void main(String args[]) {
        try {
            // Open your connection to a server, at port 5432
            // localhost used here
            Socket s1 = new Socket("localhost", 5432);
            System.out.println("Connection established at port 5432");

            // Get an input stream from the socket
            ObjectInputStream input = new ObjectInputStream (s1.getInputStream());
            // Decorate it with a "data" input stream
            Book bookReceived = (Book) input.readObject(); 
            System.out.println("Getting data...");
            // Read the input and print it to the screen
            System.out.println(bookReceived);

            // When done, just close the stream and connection
            input.close();
            s1.close();
            System.out.println("Connection closed.");
        }
        catch (ConnectException connExcep) {
            System.out.println("Error connection: " + connExcep.getMessage());
        }
        catch (IOException ioExcep) {
            System.out.println("Error: " + ioExcep.getMessage());    
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
