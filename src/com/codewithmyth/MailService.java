package com.codewithmyth;

public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        // Send Email
        disconnect();
    }

    /* Following methods are implementation details. So, these methods shouldn't visible
       to the user (should hide from user) */
    private void connect() {
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }
        // access modifiers භාවිතයෙන් implementation details userගෙන් hide කර ඇත
}
