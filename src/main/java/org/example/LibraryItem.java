package org.example;

public class LibraryItem {

//    The first class that you will need to create is the LibraryItem class.
//    This class will be the base class for the Album, Movie, and Book classes, and need to contain the following protected fields:

//    Property	Type	Description
//    title	    String	The title of the item
//    year	    int	    The year the item was released
//    author	String	The author of the item (if applicable)

    protected String title;
    protected int year;
    protected String author;

//    The LibraryItem class should also contain the following methods:

//    Method	    Arguments	                                Return Type Description
//    LibraryItem	title (String), year (int), author (String)	None        Constructor that initializes the fields of the class
//    toString	    None	                                    String	    Returns a string representation of the item
//    getTitle	    None	                                    String	    Returns the title of the item (getter method)
//    getYear	    None	                                    int	        Returns the year the item was released (getter method)
//    getAuthor	    None	                                    String	    Returns the author of the item (getter method)

    public LibraryItem (String title, String author, int year){
        this.title = title;
        this. author = author;
        this.year = year;
    }
//    For your toString method, return a string formatted as follows:
//    Item: <title> by <author> (<year>)

    public String toString(){
        return "Item : " + getTitle() + " by " + getAuthor() + " (" + getYear() + ")";
    }

    public void  setTitle(String title){
        this.title = title;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public  int getYear(){
        return this.year;
    }
    public String getAuthor(){
        return this.author;
    }
}
