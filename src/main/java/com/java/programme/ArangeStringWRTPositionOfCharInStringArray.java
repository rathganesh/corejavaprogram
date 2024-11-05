package com.java.programme;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArangeStringWRTPositionOfCharInStringArray {
    private Map<Integer,StringBuffer> output = new LinkedHashMap<>();
    private StringBuffer outputString = new StringBuffer();
public String printStringAsPerPosition(String[] name) {
    for (int i = 0; i < name.length; i++) {
        for (int j = 0; j < name[i].length(); j++) {
            if (output.get(j) == null) {
                output.put(j, new StringBuffer(String.valueOf(name[i].charAt(j))));
            } else
                output.put(j, output.get(j).append(name[i].charAt(j)));
        }
    }
    for (Map.Entry<Integer, StringBuffer> outputValue : output.entrySet()) {
        outputString.append(outputValue.getValue());
    }
    return outputString.toString();
  }
}
