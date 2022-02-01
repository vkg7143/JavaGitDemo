package org.vcs.array;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
public static void main(String args[])
{
    int[] arr=new int[]{3,4,5,6,7,8,1,2};
new PairSum().pairSum(arr,100);
}
public  void pairSum(int ar[],int target)
{
    boolean flag=false;
    for(int i=0;i<ar.length-1;i++) {
        for (int j = i + 1; j < ar.length; j++) {
            if (ar[i] + ar[j] == target) {
                m1.put(ar[i],ar[j]);
                flag=true;

            }

            }
        }
    if(flag==true)
    {
        System.out.println(m1);
    }
    else
    {
        System.out.println("No pair found");
    }
    }




}



