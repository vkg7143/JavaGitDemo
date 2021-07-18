package org.vcs.conditionprogram;

public class CheckAlphanumeric {
    public static void main(String[] args) {
        char str = '9';
        checkAlphaNumeric(str);
    }

    static void checkAlphaNumeric(char str) {
             if ((str > 'a' && str < 'z') || (str > 'A' && str < 'Z')) {
            System.out.println("character is alphabet");
        } else {
            System.out.println("character is digit");
        }
    }
}
