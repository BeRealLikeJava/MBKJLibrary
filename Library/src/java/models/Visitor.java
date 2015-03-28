/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author mateusz
 */
public class Visitor extends Person {
    
    private ArrayList<Book> bookList;
    
    public void setBookList(ArrayList<Book> list)
    {
        this.bookList = list;
    }
    
    public ArrayList<Book> getBookList()
    {
        return this.bookList;
    }
}
