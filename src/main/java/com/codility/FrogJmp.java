package com.codility;

public class FrogJmp {
    public int solution(int X, int Y, int D){
        if(X == Y || X > Y){
            return 0;
        }
        int gap = Y-X;
        int jumpCount = gap / D;

        if(gap % D != 0){
            return jumpCount + 1;
        }else{
            return jumpCount;
        }
    }
}
