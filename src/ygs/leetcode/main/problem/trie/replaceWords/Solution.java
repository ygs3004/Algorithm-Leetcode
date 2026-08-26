package ygs.leetcode.main.problem.trie.replaceWords;

import java.util.*;

public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie root = new Trie();

        for(String word: dictionary){
            Trie head = root;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(head.next[c - 'a'] == null){
                    head.next[c - 'a'] = new Trie();
                }
                head = head.next[c - 'a'];

                if(i == word.length() - 1){
                    head.isLast = true;
                }
            }
        }

        String[] sentenceArr = sentence.split(" ");
        for(int i = 0; i < sentenceArr.length; i++){
            String word = sentenceArr[i];
            Trie head = root;
            int length = 0;
            for(int j = 0; j < word.length(); j++){
                char c = word.charAt(j);
                if(head.next[c - 'a'] == null) break;
                head = head.next[c - 'a'];
                length++;
                if(head.isLast){
                    sentenceArr[i] = word.substring(0, length);
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String word: sentenceArr){
            sb.append(word);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private static class Trie{
        Trie[] next;
        boolean isLast;

        Trie(){
            next = new Trie[26];
            isLast = false;
        }
    }
}