package org.vcs.abs;

public abstract class AbstractClass {
    static final int aa = 34,bb=45;
    public abstract void sum(int a,int b);
    public void print(){
        System.out.println("this is abstract class with no abstract method");
    }
    public AbstractClass()
    {
        System.out.println("I am constructor from abstract class");
    }

}
