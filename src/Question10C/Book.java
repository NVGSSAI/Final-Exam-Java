/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10C;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Book {

    private String bookName;
    private double bookPrice;

    public Book(String bookName, double bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    @Override
    public String toString() {
        return "Book:" + "bookName: " + bookName + ", bookPrice: " + bookPrice;
    }

}
