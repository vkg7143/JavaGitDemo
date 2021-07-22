package org.vcs.string;

public class SortingCharacter {
    public static void main(String[] args) {
        String str = "BAD";
        String sortedText = sortText(str);
        System.out.println("Sorted Text::" + sortedText);
    }

    private static String sortText(String str) {
        char ch[] = str.toCharArray();

        int k = 0;
        char t;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] < ch[i]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }

        }
        return new String(ch);
    }
}
