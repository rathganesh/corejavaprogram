package com.java.programme;

public class ReverseString {
    private StringBuffer stringBufferObject;

    public void withoutPredefinedMethod(String Input){
        System.out.println("Reverse String of input String : (" +Input+ ") as below");
        for (int i=Input.length()-1; i>=0; i--){
            System.out.print(Input.charAt(i));
        }
        System.out.println();
    }

    public void usingStringBuffer(String Input){
        stringBufferObject = new StringBuffer(Input);
        System.out.println("Reverse String of input String : (" +Input+ ") as below");
        System.out.println(stringBufferObject.reverse());
    }

    public void usingStringBufferWithoutPredefinedMethod(String Input){
        stringBufferObject = new StringBuffer();
        System.out.println("Reverse String of input String : (" +Input+ ") as below");
        for (int i=Input.length()-1; i>=0; i--){
            stringBufferObject.append(Input.charAt(i));
        }
        System.out.println(stringBufferObject);
    }
}
