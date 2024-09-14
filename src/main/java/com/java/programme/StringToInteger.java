package com.java.programme;

public class StringToInteger {
    private int negativeNumber = 0;
    private int output = 0;
    private int number =0;

    public void convertStringToInteger(String Input){
        try {
            System.out.println("String "+Input+" convert to number : "+Integer.parseInt(Input));
        }catch (NumberFormatException exception){
            throw new NumberFormatException("String "+Input+" format is not correct");
        }
    }

    public void convertStringToIntegerWithOutPredefinedMethod(String Input){
        if (Input.charAt(0)=='-'){
            negativeNumber = 1;
        }
        for (int i = this.negativeNumber; i<Input.length(); i++){
           if ((!Character.isDigit(Input.charAt(i)))){
               throw new NumberFormatException("String "+Input+" format is not correct");
           }
            number = Input.charAt(i) - '0';
            output = number + output*10;
        }
        if (negativeNumber==1){
             System.out.println("String "+Input+" convert to number : "+-output);
        }else
            System.out.println("String "+Input+" convert to number : "+output);
        negativeNumber = 0;
        output = 0;
        number =0;
    }
}
