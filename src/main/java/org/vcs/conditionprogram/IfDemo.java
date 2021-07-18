package org.vcs.conditionprogram;

public class IfDemo {
    public static void main(String[] args) {
        int num=-10;
        if( checkPositiveNumber(num)) {
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative number");
        }
    }


    static boolean checkPositiveNumber(Integer num)
    {
        boolean result;
        if(num>0) {
            result=true;
        }
        else {
            result=false;
        }
        return result;
    }
}