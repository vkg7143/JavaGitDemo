package org.vcs.intrfc;

public class InterfaceDriver implements InterfaceFile {
    @Override
    public void sum(int a, int b) {

    }

    @Override
    public void print() {
        System.out.println("Hi!!, I am from class and been extracted");
    }

    public static void main(String[] args) {
        InterfaceDriver interfaceDriver=new InterfaceDriver();
        interfaceDriver.sum(6,7);
    }
}