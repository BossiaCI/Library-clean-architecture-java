package com.library.domain.services;

public class NotificationService {

    public void sendOverdueNotification(String memberEmail) {
        // Placeholder for real notification logic
        System.out.println("Sending overdue notification to: " + memberEmail);
    }

    public void sendReservationAvailableNotification(String memberEmail) {
        // Placeholder for real notification logic
        System.out.println("Reservation available notification sent to: " + memberEmail);
    }

    public void sendEmail(String email, String message) {
        // Placeholder for email sending logic
        System.out.println("Sending email to " + email + ": " + message);
    }

    public void sendSMS(String phoneNumber, String message) {
        // Placeholder for SMS sending logic
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
