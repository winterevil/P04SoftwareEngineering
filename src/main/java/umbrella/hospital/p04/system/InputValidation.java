/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umbrella.hospital.p04.system;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class InputValidation {

    static Border redBorder = BorderFactory.createLineBorder(Color.red, 2);
    static Border defaultBorder = new JTextField().getBorder();

    /**
     * This method is used to validate email address. Please note that this is a
     * <b>trial version</a>, please visit <a href ='my_website.com'> here </a>
     *
     * @param email the email you want to validate
     * @return true/false/ accordingly
     */
    //User method email checking
    public static boolean checkEmail(String email) {
        return email.matches("[a-zA-Z0-9_.-]{3,50}@[a-zA-Z1-9-]{3,30}[.][a-z1-9]{2,5}([.][a-z1-9]{2,5})?");
    }

    /**
     * This method is used for desktop only
     */
    public static boolean checkName(JTextField nameField) {
        String name = nameField.getText();
        if (!name.matches("[a-zA-Z1-9\\s]{3,50}")) {
            nameField.setBorder(redBorder);
            nameField.requestFocusInWindow();
            return false;
        }
        nameField.setBorder(defaultBorder);
        return true;
    }

    public static boolean checkCode(JTextField codeField) {
        String code = codeField.getText();
        if (!code.matches("(SE|IA|FSB)\\d{5}")) {
            codeField.setBorder(redBorder);
            codeField.requestFocus();
            return false;
        }
        codeField.setBorder(defaultBorder);
        return true;
    }

    public static boolean checkEmail(JTextField emailField) {
        String email = emailField.getText();
        if (!email.matches("[a-zA-Z0-9_.-]{3,50}@[a-zA-Z1-9-]{3,30}[.][a-z1-9]{2,5}([.][a-z1-9]{2,5})?")) {
            emailField.setBorder(redBorder);
            emailField.requestFocus();
            return false;
        }
        emailField.setBorder(defaultBorder);
        return true;
    }

    public static boolean checkPhone(JTextField phoneField) {
        String phone = phoneField.getText();
        if (!phone.matches("[0-9]{9,11}")) {
            phoneField.setBorder(redBorder);
            phoneField.requestFocus();
            return false;
        }
        phoneField.setBorder(defaultBorder);
        return true;
    }

    //defaut method email checking
    public static boolean checkEmail(String email, String pattern) {
        return email.matches(pattern);
    }

    public static boolean checkCharacterCount(JPasswordField textField, int requiredCount) {
        String input = String.valueOf(textField.getPassword());
        if (input.length() >= requiredCount) {
            textField.setBorder(defaultBorder);
            return true;
        } else {
            textField.setBorder(redBorder);
            return false;
        }
    }
}
