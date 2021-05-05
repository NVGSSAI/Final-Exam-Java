/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10C;

import java.util.ArrayList;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class BookDriver {

    public static int index = 0;
    public static ArrayList<Book> books = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question-10c: Venkata Gopi Siva Sai Nallapati");
        // TODO code application logic here

        books.add(new Book("To Kill a Mockingbird", 126.0));
        books.add(new Book("Pride and Prejudice", 520.0));
        books.add(new Book("The Diary of Anne Frank", 1200.50));
        books.add(new Book("1984", 432.32));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", 530.25));
        books.add(new Book("The Lord of the Rings", 500.25));
        System.out.println("Searched book was: To Kill a Mockingbird");
        System.out.println(searchBook("To Kill a Mockingbird"));

    }

    public static String searchBook(String bookName) {
        if (books.get(index).getBookName().equalsIgnoreCase(bookName)) {
            return books.get(index).toString();
        } else {
            if (index == books.size() - 1) {
                return "Book not found";
            }
            index++;
            return searchBook(bookName);
        }
    }

}
