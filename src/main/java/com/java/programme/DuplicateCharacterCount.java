package com.java.programme;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount {
    private char[] characterArray;
    private HashMap<Character,Integer> output;

    private void characterCount(String InputString){
        characterArray = InputString.toCharArray();
        output = new HashMap<>();
        for(char character: characterArray){
            if (output.containsKey(character)){
                output.put(character,output.get(character)+1);
            }else
                output.put(character,1);
        }
    }

    public void duplicateCharCount(String Input){
        characterCount(Input);
        System.out.println("Duplicate element with their values :" );
        for (Map.Entry<Character,Integer> entry:
             output.entrySet()) {
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
}
