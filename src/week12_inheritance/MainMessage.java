/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_inheritance;

/**
 *
 * @author imsil
 */
public class MainMessage {

    public static void main(String[] args) {
        Email email = new Email("abc@xyz.com", "def@ghi.com", "Clerk Position", "Please find my most updated resume.");
        SMS sms = new SMS("+16475231258", "This to remind you that your survey is incomplete");

        System.out.println(email);
        
        System.out.println("Email contains \"com\" is " + ContainsKeyword(email,"com")+"\n");
        
        System.out.println(sms);

        System.out.println("SMS contains \"+1\" is " + ContainsKeyword(sms,"+1")+"\n");
        
        System.out.println("Encoded Email");
        System.out.println(EncodeMessage(email)+"\n");
        System.out.println("Encoded SMS");
        System.out.println(EncodeMessage(sms));
        
        System.out.println(encode(sms));
    }

    public static boolean ContainsKeyword(Message messageObject, String keyword) {
        if (messageObject.toString().indexOf(keyword, 0) >= 0) {
            return true;
        }
        return false;
    }
    
    public static String EncodeMessage(Message messageObject){
        
        String strEncode="";
        char chrEncode;
        
        for(int i = 0 ; i < messageObject.toString().length() ; i++){
            chrEncode = messageObject.toString().charAt(i);
            
            
            if(chrEncode == 'Z')
                chrEncode = 'A';
            else if(chrEncode == 'z')
                chrEncode = 'a';
            else
                chrEncode++;
            
            strEncode += chrEncode;
        }
        return strEncode;
    }
    
    public static String encode(Message messageObj) {
        char[] msgArray = messageObj.toString().trim().toCharArray();
        
        String output = "";
        
        for(char msg:msgArray){
            output += (char)(msg+1);
        }
        return output;
    }
}
