package ygs.leetcode.main.problem.slidingWindow.minimumWindowSubstring;

import java.util.*;

public class Solution {
    public String minWindow(String s, String t) {

        // t의 문자열 정보 저장
        Map<Character, Integer> chkMap = new HashMap<>();
        for(char c : t.toCharArray()){
            chkMap.put(c, chkMap.getOrDefault(c, 0) + 1);
        }

        // 슬라이딩 되는 문자열 저장
        Map<Character, Integer> curMap = new HashMap<>();

        // t의 문자열의 총 개수
        int complete = t.length();
        // t의 문자열과 현재 슬라이딩 중인 문자열의 개수가 같은 정도
        int maked = 0;
        String answer = "";

        // 좌측
        int l = 0;
        // 우측을 증가시키며 체크
        for(int r = 0; r < s.length(); r++){
            char right = s.charAt(r);
            // 현재 우측 문자의 포함여부 확인
            if(chkMap.containsKey(right)){
                int value = chkMap.get(right);
                int curValue = curMap.getOrDefault(right, 0) + 1;
                curMap.put(right, curValue);
                // 동일 문자가 나오는 경우 필요한 문자인지 체크
                if(curValue <= value) maked++;
            }

            // 좌측 문자의 최대값 찾기
            while(complete == maked){
                String now = s.substring(l, r + 1);
                answer = answer.length() == 0 || now.length() < answer.length() ? now : answer;

                char left = s.charAt(l);
                if(chkMap.containsKey(left)){
                    int value = chkMap.get(left);
                    int curValue = curMap.get(left) - 1;
                    curMap.put(left, curValue);
                    if(curValue < value) maked--;
                }

                // 우측이 고정된 상태에서 좌측을 증가시키며 체크
                l++;
            }
        }

        return answer;
    }
}