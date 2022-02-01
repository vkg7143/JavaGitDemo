package org.vcs.array;

public class FindIndex {



    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[3] = 3;
        int index=0;
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        if(arr[index]!=0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
