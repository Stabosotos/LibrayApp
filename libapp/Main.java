package libapp;



public class Main {

    public static void main(String[] args) {
        // Instance
        LibraryApp app = new LibraryApp();

        // Call the search method. Put an ISBN inside ""
        app.searchByIsbn("34567");
        // Call the search method. Put a keyword inside ""
        app.searchByTitle("pleasant");

    }



}