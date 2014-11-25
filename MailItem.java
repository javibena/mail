
/**
 * Write a description of class mailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    // instance variables - replace the example below with your own
    private String from;
    
    private String to;
    
    private String message;
    
    /**
     * 
     */
    public MailItem(String newmessage, String newfrom, String newto)
    {
        //
        message = newmessage;
        from = newfrom;
        to = newto;
    }
    /**
     *
     */
    public String getFrom()
    {
        // 
        return from;
    }

    /**
     * 
     */
    public String getMessage()
    {
        // 
        return message;
    }
    
    /**
     * 
     */
    public String getTo()
    {
        //
        return to;
    }
    /**
     * 
     */
    
    public void print()
    {
        //
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Message: " + message);
    }
   
}
