package com.programers.kp;

import java.util.*;

public class Pro2 {
    public String[] solution(String[] grades) {
        String [] answer = {};

        HashMap<String, String> map = new HashMap<>();
        for (String grade : grades){
            String empdata[] = grade.split(" ");
            String hj = empdata[0].trim();
            String sj = empdata[1].trim();
            map.put(hj, sj);
        }

        List<Map.Entry<String, String>> list = new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Map<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

//        Object[] objectArray = result.entrySet().toArray();

        String[][] strings = map.entrySet()
                .stream()
                .map(e -> new String[]{e.getKey(), e.getValue().toString()})
                .toArray(String[][]::new);

        for (int i = 0 ; i < strings.length ; i ++){
            answer[i] = strings[i][0] + " " + strings[i][1];
        }

        return answer;
    }
}
