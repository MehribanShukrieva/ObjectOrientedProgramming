public class Email extends Document {
    private String subject;
    private String[] to;

   
     public Email() {
        super(); 
        to = new String[0]; 
    }

    
    public String getSubject() {
        return subject;
    }

    public String[] getTo() {
        return to;
    }
}
