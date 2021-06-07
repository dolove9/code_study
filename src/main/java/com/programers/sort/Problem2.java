package com.programers.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Problem2 {
    public String solution(int[] numbers) {
        String answer = "";

        String [] strings = new String[numbers.length];
        for(int i = 0 ; i < numbers.length ; i++){
            strings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);  //오름차순 정렬 (o1+o2).compareTo(o1+o2);
            }
        });

        if(strings[0].equals("0")){
            return "0"; //제일 앞자리가 0이면 0전부 0임.
        }

        for(String temp : strings){
            answer += temp;
        }
        return answer;
    }
}
