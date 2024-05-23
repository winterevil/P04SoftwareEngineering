/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umbrella.hospital.p04.login;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import umbrella.hospital.p04.model.Doctor;
import umbrella.hospital.p04.model.Patient;

public class SendEmail {

    public String getRandom() {
        Random random = new Random();
        int number = random.nextInt(999999);
        return String.format("%06d", number);
    }

    public boolean sendEmail(Doctor doctor, Patient patient) {
        boolean test = false;
        String toEmail;
        if (doctor != null) {
            toEmail = doctor.getEmail();
        } else {
            toEmail = patient.getEmail();
        }
        String fromEmail = "restaurantsavoria@gmail.com";
        String password = "hxet rqep bxnz qnpw";

        try {
            Properties pr = new Properties();
            pr.put("mail.smtp.auth", "true");
            pr.put("mail.smtp.starttls.enable", "true");
            pr.put("mail.smtp.host", "smtp.gmail.com");
            pr.put("mail.smtp.port", "25");
            pr.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            Session session = Session.getInstance(pr, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            });

            Message mess = new MimeMessage(session);

            mess.setFrom(new InternetAddress(fromEmail));
            mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            mess.setSubject("Savoria Account Verification Code");
            String code;
            if (doctor != null) {
                code = doctor.getCode();
            } else {
                code = patient.getCode();
            }
            mess.setContent("Please enter this code in order to verify your sign up or changing your password. Your verification code is: " + code + ". Please, do not share this code with anyone. Thank you!", "text/html");

            Transport.send(mess);
            System.out.println("Sent email successfully");

            test = true;
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return test;
    }
}
