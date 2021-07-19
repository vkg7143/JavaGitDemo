package org.vcs.string;

import java.util.HashMap;
import java.util.Map;

public class RepetiveCharacterCount
{
    public static void main(String[] args) {
        String str = "vivek kumar";
        int[] freq = new int[str.length()];
        int i, j;

        //Converts given string into character array
        char string[] = str.toCharArray();
Map<Character,Integer> m1=new HashMap<Character,Integer>();
        for(i = 0; i <str.length(); i++) {
         int c = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                   c=c+1;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
                if(string[i]!='0' && string[i]!=' ') {
                    m1.put(string[i], c);
                }
            }

        }
        System.out.println(m1);
        //Displays the each character and their corresponding frequency
//        System.out.println("Characters and their corresponding frequencies");
//        for(i = 0; i <freq.length; i++) {
//            if(string[i] != ' ' && string[i] != '0')
//                System.out.println(string[i] + "-" + freq[i]);
        }
    }
