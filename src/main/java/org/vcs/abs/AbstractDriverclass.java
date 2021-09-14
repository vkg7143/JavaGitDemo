package org.vcs.abs;

public class AbstractDriverclass extends AbstractClass{
int n1,n2;

    @Override
    public void sum(int a, int b) {

        n1=a;
        n2=b;
        System.out.println("sum="+ Integer.parseInt(String.valueOf(a+b)));
    }

    @Override
    public void print() {

        System.out.println("I am from sub class");
    }

    public static void main(String[] args) {
        AbstractDriverclass abstractDriverclass=new AbstractDriverclass();
        abstractDriverclass.sum(10,20);
        System.out.println("AA="+AbstractDriverclass.aa);
        System.out.println("BB="+AbstractDriverclass.bb);
        AbstractDriverclass abc= new AbstractDriverclass() {
            @Override
            public void sum(int a, int b) {
       int s=0;
        s=a+b;
                System.out.println("sum="+s);
            }
        };
        abc.sum(2,3);
        abc.print();
    }
}

