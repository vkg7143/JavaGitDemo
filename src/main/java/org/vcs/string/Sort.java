package org.vcs.string;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String str="bca";
        char ch[]=str.toCharArray();

        StringBuilder stringBuilder =new StringBuilder();

Arrays.sort(ch);
        System.out.println(new String(ch));

    }
}
