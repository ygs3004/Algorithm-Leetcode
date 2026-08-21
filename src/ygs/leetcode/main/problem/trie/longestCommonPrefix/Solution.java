package ygs.leetcode.main.problem.trie.longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Trie root = new Trie();
        for(String str: strs){
            Trie head = root;
            char[] c = str.toCharArray();
            for(int i = 0; i < c.length; i++){
                int check = c[i] - 'a';
                if(head.next[check] == null){
                    head.next[check] = new Trie();
                }else{
                    head.next[check].repeat++;
                }
                head = head.next[check];
            }
        }

        StringBuilder sb = new StringBuilder();
        Trie head = root;
        while(head != null){
            Trie[] next = head.next;
            boolean isExist = false;
            for(int i = 0; i < next.length; i++){
                if(next[i] != null && next[i].repeat == strs.length){
                    isExist = true;
                    sb.append(Character.toString(i + 'a'));
                    head = next[i];
                    break;
                }
            }

            if(!isExist) break;
        }

        return sb.toString();
    }

    private static class Trie{
        Trie[] next;
        int repeat;

        Trie(){
            next = new Trie[26];
            repeat = 1;
        }
    }
}