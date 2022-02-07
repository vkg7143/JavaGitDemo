package org.vcs.string;

public class IsString {
    public static void main(String[] args) {
        String str="heisgreatman";
if(IsString.isString(str))
    System.out.println("Its string");
else
    System.out.println("Its something else");
    }
   static boolean  isString(String str)
    {
        return (str!=null)&&(!str.equals("")&&(str.chars().allMatch(Character::isLetter)));
    }
}
