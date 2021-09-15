package org.vcs.intrfc;

public interface InterfaceFile {
    default void sum(int a,int b ) {
        int s;
        s=a+b;
        System.out.println("sum="+s);
    }
    public void print();
    }

