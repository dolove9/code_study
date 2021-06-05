package com.programers.chap1;

import com.sun.xml.internal.ws.util.QNameMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Spy {
    public int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, String> temp = new HashMap<>();
        for (int i = 0 ; i < clothes.length; i++){
            temp.put(clothes[i][0], clothes[i][1]);
        }

        Collections.frequency(Collections.singleton(temp), "value");

        return answer;
    }
}
