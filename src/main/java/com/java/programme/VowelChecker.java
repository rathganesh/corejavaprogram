package com.java.programme;

public class VowelChecker {
    private String vowelCharacter = "aeiou";
    public void validateVowelCheck(char Character){
        System.out.println("Vowel is present : "+vowelCharacter.contains(String.valueOf(Character)));
    }
}
