package org.vcs.string;

public class SentenceFirstLetterCapital {
    public static void main(String[] args) {
        {
            String str = "My Name is khan";
            String result = convertWord(str);
            System.out.println("Converted string=" + result);
        }

    }

    private static String convertWord(String str) {
        String str1[];
        str1 = str.split(" ");
        String result = "";
          int l=str1.length;
        for (int i = 0; i <1 ; i++) {
            {
                char ch[];
            for (int j = 0; j < str1.length; j++) {

                    ch = str1[j].toCharArray();
                    if(ch[i]>'a'&& ch[i]<'z') {
                        ch[i] = (char) (ch[i] - 32);
                    }
                    result=result+new String(ch)+" ";
                }

            }
        }
        return result;

    }
}
