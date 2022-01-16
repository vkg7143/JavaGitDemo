package org.vcs.sortmapvalue;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class SortMapJava8 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        Map<Integer,String> sortedMap=new HashMap<Integer,String>();
        map.put(1,"raj");
        map.put(2,"ankush");
        map.put(3,"dilo");
        List<String> l1=new ArrayList<String>();
        List<String> l2=new ArrayList<String>();
        l1.add("vivek");
        l1.add("mohan");
        l1.add("vivek");

        //System.out.println(ll2);
     sortedMap=  map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
             collect(toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
        System.out.println(sortedMap);
    }
}
