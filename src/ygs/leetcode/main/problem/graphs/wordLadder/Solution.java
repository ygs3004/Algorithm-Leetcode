package ygs.leetcode.main.problem.graphs.wordLadder;

import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Object[]> que = new ArrayDeque<>();
        Set<String> isExist = new HashSet<>();

        que.add(new Object[]{beginWord, 1});
        wordList.forEach(word -> isExist.add(word));

        int answer = 0;
        while(!que.isEmpty()){
            Object[] info = que.poll();
            String str = (String)info[0];
            int cnt = (int)info[1];

            if(cnt > wordList.size() + 1){
                return answer;
            }

            if(str.equals(endWord)){
                answer = cnt;
                break;
            }

            char[] charArr = str.toCharArray();
            for(int i = 0; i < charArr.length; i++){
                char save = charArr[i];
                for(int j = 0; j < 26; j++){
                    charArr[i] = (char)(j + 'a');
                    String next = new String(charArr);
                    if(isExist.contains(next) && (charArr[i] != save)){
                        que.add(new Object[]{next, cnt + 1});
                        isExist.remove(next);
                    }
                }
                charArr[i] = save;
            }
        }

        return answer;
    }
}