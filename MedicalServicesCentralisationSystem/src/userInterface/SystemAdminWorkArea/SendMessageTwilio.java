/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author prans
 */
public class SendMessageTwilio {
    
    public static final String ACCOUNT_SID = "ACa1509bbf13d2f60f8628c8688e210eb0";
    public static final String AUTH_TOKEN = "09679942c1a707effb52203a65e4ae58";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+17165503721"),
                new com.twilio.type.PhoneNumber("+18578872899"),
                "Hi! We're fucked.")
            .create();

        System.out.println(message.getSid());
    }
}
