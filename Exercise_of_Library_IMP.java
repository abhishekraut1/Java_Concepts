package com.company;

class Library {
    // You have to implement a library using Java Class "Library"
    // Methods: addBook, issueBook, returnBook, showAvailableBooks
    // Properties: Array to store the available books,
    // Array to store the issued books
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    public void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added.");
    }

    public void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(int i = 0;i<this.books.length; i++){
            if(this.books[i]==null){
               continue;
            }
            System.out.println("* "+this.books[i]);
        }
    }

    public void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println(book + " has been issued!");
                this.books[i] = null;
                return;
            }
        }
    }
    public void returnBook(String book){
        this.addBook(book);
    }
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook("C");
        l.addBook("Java");
        l.addBook("C++");
        l.addBook("Python");
        l.showAvailableBooks();

        l.issueBook("C++");
        l.showAvailableBooks();

        l.returnBook("C++");
        l.showAvailableBooks();
    }
}










//    static String []availbooks = new String[4];
//    static String []issuebooks = new String[1];
//    public String  var;
//    public void issueBook(int i){
//        System.out.println("Book Issued");
//        issuebooks[0]=availbooks[i];
//        var=issuebooks[0];
//        availbooks[i]=null;
//    }
//    public void returnBook(int i){
//        System.out.println("Book Returned");
//        issuebooks[0]=null;
//    }
//    public void addBook(int i){
//        System.out.println("Book Added");
//        availbooks[i]=var;
//    }



// availbooks[0] = "book1";
//         availbooks[1] = "book2";
//         availbooks[2] = "book3";
//         availbooks[3] = "book4";
//         Exercise_of_Library obj = new Exercise_of_Library();
//         System.out.print("Available books are ");
//         for(int i=0;i< availbooks.length;i++)
//        System.out.print(availbooks[i]+" ");
//        System.out.println();
//        obj.issueBook(0);
//        System.out.println("Issued book is "+issuebooks[0]);
//
//        obj.returnBook(0);
//        System.out.println("Issued book is "+issuebooks[0]);
//
//        obj.addBook(0);
//        System.out.print("Available books are ");
//        for(int i=0;i< availbooks.length;i++)
//        System.out.print(availbooks[i]+" ");
//        System.out.println();
//        System.out.println("Issued book is "+issuebooks[0]);