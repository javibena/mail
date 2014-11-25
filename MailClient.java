
/**
 * Write a description of class mailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // 
    private MailServer server;
    
    private String user;

    /**
     * 
     */
    public MailClient(String newUser, MailServer newServer)
    {
        // 
        server = newServer;
        user = newUser;
    }

    /**
     * 
     */
    public MailItem getnextMailItem()
    {
        // 
        return server.getNextMailItem(user);
    }
    /**
     * 
     */
    public void printNextMailItem()
    {
      MailItem item = server.getNextMailItem(user);   
     if( item == null )
      {
      System.out.println("There´s no new mail");
    }
    else 
    {
       item.print(); 
    }
}
    /**
     * 
     */
    public void sendMailitem(String to, String message)
    {
       MailItem item = new MailItem(user, to, message);
       server.post(item);
    }
    }
    

