package org.vcs.string;

public class ReverseString {

    public static void main(String[] args) {
        String str = "VIVEK";
        System.out.println("Revering string using char ="+reverseString(str));
    }

    private static String reverseString(String str) {
        char ch[]=str.toCharArray();
        int j=0;
        char ch1[]=new char[str.toCharArray().length];
        for(int i=ch.length-1;i>=0;i--)
        {
           ch1[j]=ch[i];
           j++;
        }
     return new String(ch1);
    }

}

