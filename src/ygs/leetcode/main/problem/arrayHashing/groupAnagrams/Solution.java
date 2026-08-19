package ygs.leetcode.main.problem.arrayHashing.groupAnagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String reArrange = new String(c);
            if(!map.containsKey(reArrange)){
                map.put(reArrange, new ArrayList<>());
            }

            map.get(reArrange).add(str);
        }

        return new ArrayList<>(map.values());
    }
}