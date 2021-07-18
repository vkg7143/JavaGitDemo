package org.vcs.loop;

public class ForLoopProg1 {
    public static void main(String[] args) {
        System.out.println("Printing 1 to 10");
        print();
    }

    private static void print() {
        for (int i=1;i<=10;i++)
        {
            System.out.format("%d\n",i);
        }
    }
}
