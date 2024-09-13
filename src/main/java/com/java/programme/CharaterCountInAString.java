package com.java.programme;

import java.util.HashMap;

/*
    This programme will return character count in a given string
 */
public class CharaterCountInAString {

    private char[] characterArray;
    private HashMap<Character,Integer> output;

    public void characterCount(String InputString){
        characterArray = InputString.toCharArray();
        output = new HashMap<>();
        for(int i=0; i<characterArray.length ; i++){
            if (output.containsKey(characterArray[i])){
                output.put(characterArray[i],output.get(characterArray[i])+1);
            }else
                output.put(characterArray[i],1);
        }
        System.out.println(output);
    }


}
