package com.codility;

public class BinaryGap {
    public int solution(int n) {
        int gapCount = 0;

        if(n == 1){
            return 0;
        }

        char[] chars = Integer.toBinaryString(n).toCharArray();

        int tempGap = 0;
        for (int i = 0 ; i < chars.length ; i++){
            if(chars[i] == '0'){
                tempGap++;
                continue;
            }else if(chars[i] == '1'){
                if(tempGap > gapCount){
                    gapCount = tempGap;
                }
                tempGap = 0;
            }
        }

        return gapCount;
    }
}
