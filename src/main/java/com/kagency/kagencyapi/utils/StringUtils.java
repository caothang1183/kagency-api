package com.kagency.kagencyapi.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;
import java.util.regex.Pattern;

public final class StringUtils {

    public static boolean validEmail(String email) {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if (pattern.matcher(email).matches()) {
            return true;
        }
        ;
        return false;
    }

    public static String hashPassword(String password) {
        int strength = 10;
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(strength, new SecureRandom());
        return bCryptPasswordEncoder.encode(password);
    }
}
