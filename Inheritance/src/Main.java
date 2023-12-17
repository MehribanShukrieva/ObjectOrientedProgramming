public class Main {
    public static void main(String[] args) {
        
        Book book = new Book();
        book.addAuthor("Author 1");
        book.addAuthor("Author 2");
        book.addAuthor("Author 3");
        book.addAuthor("Author 4");
        book.addAuthor("Author 5");
        book.addAuthor("Author 6");
        book.addAuthor("Author 7");

        book.getTitle(); 

        Email email = new Email();
        email.addAuthor("Email Author");
        email.getTo(); 
    }
}
