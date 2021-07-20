package org.vcs.string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacterCount {
    public static void main(String[] args) {
        String str = "vvvvvv  aaaaa kkkk o p";
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        m1 = countFrequecy(str);
        for (Map.Entry<Character, Integer> freqMap : m1.entrySet()
        ) {
            System.out.println("Charcter " + freqMap.getKey() + "::" + freqMap.getValue());
        }
    }


    //Converts given string into character array


    private static Map<Character, Integer> countFrequecy(String str) {
        int[] freq = new int[str.length()];
        int i, j;
        char[] string = str.toCharArray();
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        for (i = 0; i < str.length(); i++) {
            int c = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    c = c + 1;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
                if (string[i] != '0' && string[i] != ' ') {
                    m1.put(string[i], c);
                }
            }

        }

        return m1;


    }
}
