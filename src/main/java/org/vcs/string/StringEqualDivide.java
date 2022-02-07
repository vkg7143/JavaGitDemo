package org.vcs.string;

public class StringEqualDivide {

    public static void main(String[] args) {
        int t=0;
        String str="mymymy";
        int n=str.length();
        int chars=n/2;

        String[] tempStr=new String[2];

     for(int i=0;i<str.length();i+=chars)
     {

          String str1=str.substring(i,i+chars);
         tempStr[t]=str1;
          t++;
     }
     for(int i=0;i<tempStr.length;i++)
     {
         System.out.println(tempStr[i]+ " ");
     }
    }
}
