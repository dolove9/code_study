package com.programers.fullscan;

import java.util.*;

public class Problem1 {
    public int[] solution(int[] answers) {

        int [] person_1 = {1,2,3,4,5};
        int [] person_2 = {2,1,2,3,2,4,2,5};
        int [] person_3 = {3,3,1,1,2,2,4,4,5,5};

        int[] scores = {0,0,0};

        for(int i = 0 ; i < answers.length ; i++){
            if(person_1[i%5] == answers[i]){
                scores[0] = scores[0]+1;
            }
            if(person_2[i%8] == answers[i]){
                scores[1] = scores[1]+1;
            }
            if(person_3[i%10] == answers[i]){
                scores[2] = scores[2]+1;
            }
        }

        OptionalInt max = Arrays.stream(scores).max();
        int maxScore = max.getAsInt();

        /*
        List<Integer> resultList = new ArrayList();
        for(int i = 0 ; i < scores.length ; i++){
            if(scores[i] == maxScore){
                resultList.add(i);
            }
        }
        Collections.sort(resultList);

        int [] result = new int[resultList.size()];
        for(int i = 0 ; i < resultList.size() ; i++){
            result[i] = i+1;
        }
        return result;
         */
        List<Integer> result = new ArrayList<>();

        if(maxScore == scores[0]) result.add(1);
        if(maxScore == scores[1]) result.add(2);
        if(maxScore == scores[2]) result.add(3);

        int [] answer = new int[result.size()];
        for(int i = 0 ; i < result.size() ; i++){
            answer[i] = result.get(i);
        }

        return answer;

    }
}
