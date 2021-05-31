package com.programers.chap2;

import java.util.Arrays;
import java.util.stream.Stream;

public class BigNumbers {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }

//        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        String[] sorted;
        for (int i = 0; i < arr.length -1; i++) {
            sorted = Stream.of(arr[i], arr[i+1]).sorted().toArray(String[]::new);
        }


        if(arr[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
