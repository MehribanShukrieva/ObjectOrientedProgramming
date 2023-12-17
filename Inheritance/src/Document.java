import java.util.ArrayList;
import java.util.Date;


public class Document {
    private ArrayList<String> authors;
    private Date date;

    
    public Document() {
        authors = new ArrayList<>();
        date = new Date();
    }

    
    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String name) {
        authors.add(name);
    }

    public Date getDate() {
        return date;
    }
}






