package assigment_03;

public class TestBook {

	public static void main(String[] args) {
		
		        Library library = new Library();

		        Book book1 = new Book("Core java", "James Gosling ");
		        Book book2 = new Book("c++", "Bjarne Stroustrup");

		        library.addBook(book1);
		        library.addBook(book2);

		        library.displayBooks();

		        library.removeBook("Core java");

		        library.displayBooks();
		    }
		
	}


