package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] array2 = new String[]{
                "cat", "dog", "crocodile", "tiger", "deer", "cat", "moose", "wolf","cat"
        };
        Map<String,Integer > map=new HashMap<>();
        for (String s:array2) {
           Integer i = map.putIfAbsent(s, 1);

            if (i!=null){
                map.put(s,i+1);
            }

        }
        for (Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println(item.getKey()+":"+item.getValue());
        }
    }
}
