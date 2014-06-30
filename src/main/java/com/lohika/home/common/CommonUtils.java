package com.lohika.home.common;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("[a-zA-Z]*[0-9]*@[a-zA-Z]*\\.[a-zA-Z]*");
    
    public static String MD5Generate(String pass) {
        String hashpass = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(pass.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            hashpass = number.toString(16);
            while (hashpass.length() < 32) {
                hashpass = "0" + hashpass;
            }
            return hashpass;
        } catch (NoSuchAlgorithmException e) {
            // logger.debug("error in MD5 algorithm "+e);
        }
        return hashpass;
    }

    /**
     * @param eMail
     * @return true - email is correct; false - email is wrong
     * */
    public static boolean validateMail(String eMail) {
        Matcher m = EMAIL_PATTERN.matcher(eMail);
        return m.matches();
    }
}
