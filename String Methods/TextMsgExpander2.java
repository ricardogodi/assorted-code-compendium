import java.util.Scanner;
public class TextMsgExpander2
{
   public static void main(String[ ] args)
   {
        Scanner in;
        in = new Scanner(System.in);
    String txtMsg;
     
       String BFF = "best friend forever";
       String IDK = "I don't know";
       String JK = "just kidding";
       String TMI = "too much information";
       String TTYL = "talk to you later";
       
       System.out.println("Enter text: ");
       txtMsg=in.nextLine();
         
       System.out.println("You entered: "+txtMsg);
       System.out.println();
 
       if(txtMsg.contains("BFF"))
       {
           txtMsg=txtMsg.replace("BFF",BFF);
           System.out.println("Replaced \"BFF\" with " + "\"" + BFF + "\"" + ".");
       }
 
       if(txtMsg.contains("IDK"))
       {
           txtMsg=txtMsg.replace("IDK",IDK);
           System.out.println("Replaced \"IDK\" with " + "\"" + IDK + "\"" + ".");
       }
 
       if(txtMsg.contains("JK"))
       {
           txtMsg=txtMsg.replace("JK",JK);
           System.out.println("Replaced \"JK\" with " + "\"" + JK + "\"" + ".");
       }
 
       if(txtMsg.contains("TMI"))
       {
           txtMsg=txtMsg.replace("TMI",TMI);
           System.out.println("Replaced \"TMI\" with " + "\"" + TMI + "\"" + ".");
       }
 
       if(txtMsg.contains("TTYL"))
       {
           txtMsg=txtMsg.replace("TTYL",TTYL);
           System.out.println("Replaced \"TTYL\" with " + "\"" + TTYL + "\"" + ".");
       }
 
    System.out.println();
    System.out.println("Expanded: "+txtMsg);
     }
 
    }