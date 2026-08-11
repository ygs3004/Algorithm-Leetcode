package ygs.leetcode.main.problem.trie.designAddandSearchWordsDataStructure;

import java.util.*;

class WordDictionary {

    WordNode root;

    public WordDictionary() {
        this.root = new WordNode();
    }

    public void addWord(String word) {

        WordNode before = this.root;

        for(int i = 0; i < word.length(); i++){
            int cur = word.charAt(i) - 'a';

            if(before.next[cur] == null){
                before.next[cur] = new WordNode();
            }

            before = before.next[cur];
        }

        before.isLast = true;
    }

    public boolean search(String word) {
        List<WordNode> beforeList = new ArrayList<>();
        WordNode start = this.root;
        beforeList.add(start);
        boolean result = false;
        for(int i = 0; i < word.length(); i++){
            char cur = word.charAt(i);
            List<WordNode> nextList = new ArrayList<>();

            for(WordNode before : beforeList){
                if(cur == '.'){
                    for(int j = 0; j < 26; j++){
                        WordNode next = before.next[j];
                        if(next != null){
                            nextList.add(next);
                        }
                    }
                }else{
                    WordNode next = before.next[cur - 'a'];
                    if(next != null){
                        nextList.add(next);
                    }
                }

            }
            beforeList = nextList;
        }

        for(WordNode next: beforeList){
            result = result || next.isLast;
        }

        return result;
    }

    private static class WordNode{
        WordNode[] next;
        boolean isLast;

        WordNode(){
            this.next = new WordNode[26];
            isLast = false;
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */