package com.java.programme;

public class Palindrome {
    private StringBuffer stringBuffer;

    public void usingStringBuffer(String Input){
        stringBuffer = new StringBuffer(Input);
        stringBuffer.reverse();
        if (Input.equals(stringBuffer.toString())){
            System.out.println(Input+" value is a palindrome");
        }else
            System.out.println(Input+" value is not a palindrome");
    }

    public void usingStringBufferWithoutPredefinedMethod(String Input){
        stringBuffer = new StringBuffer();
        for (int i = Input.length()-1 ; i>=0; i--) {
            stringBuffer.append(Input.charAt(i));
        }
        if (Input.equals(stringBuffer.toString())){
            System.out.println(Input+" value is a palindrome");
        }else
            System.out.println(Input+" value is not a palindrome");
    }
}
