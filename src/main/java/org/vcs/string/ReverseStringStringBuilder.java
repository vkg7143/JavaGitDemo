package org.vcs.string;

public class ReverseStringStringBuilder {
    public static void main(String[] args) {
        {
            StringBuilder stringBuilder= new StringBuilder("Vivek");
            StringBuffer stringBuffer=new StringBuffer("Kumar");
            System.out.println("USing String builder"+stringBuilder.reverse());;
            System.out.println("using String Buffer="+stringBuffer.reverse());
        }
    }
}
