package org.vcs.string;

public class StringUnique {
    public static void main(String[] args) {
        String str="rajua";
        if(isUniue(str))
            System.out.println("all are unique");
        else
            System.out.println("Its not unique");
    }

    private static boolean isUniue(String str) {
        char[] chars=str.toCharArray();
        boolean flag=false;
        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=1;j<str.length();j++)
            {
                if(chars[i]!=chars[j])
                    flag=true;

                    else
                        flag=false;
                    break;
            }

        }
        return flag;
    }
}
