package org.vcs.string;

public class StringCapital {
    public static void main(String[] args) {
        String str="vivek";
        String capitalString;
        capitalString=convertCapital(str);
        System.out.println("Converted String="+capitalString);
    }

    private static String convertCapital(String str) {
        char ch[]=str.toCharArray();
        int j=0;
        char convertedString[]=new char[str.length()];

        for(int i=0;i<ch.length;i++){
        convertedString[j]= (char) (ch[i]-32);
        j++;
        }
return  new String (convertedString);
    }
}
