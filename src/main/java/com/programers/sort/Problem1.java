package com.programers.sort;

import java.util.Arrays;

public class Problem1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        for (int i =0 ; i < commands.length ; i++){
            int[] temp = commands[i];
            int [] selected = new int[(temp[1]+1)-temp[0]];
            System.arraycopy(array, temp[0]-1, selected,  0, selected.length);

            Arrays.sort(selected);

            answer[i] = selected[temp[2]-1];
        }
        return answer;
    }
}
