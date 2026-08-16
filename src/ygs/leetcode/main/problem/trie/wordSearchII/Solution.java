package ygs.leetcode.main.problem.trie.wordSearchII;

import java.util.*;

public class Solution {

    Set<String> answerSet;
    char[][] board;
    boolean[][] visited;
    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, -1, 0, 1};
    int m;
    int n;

    public List<String> findWords(char[][] board, String[] words) {
        this.board = board;
        this.m = board.length;
        this.n = board[0].length;
        this.visited = new boolean[m][n];
        TrieNode root = new TrieNode();
        answerSet = new HashSet<>();

        for(String word: words){
            TrieNode head = root;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                int check = c - 'a';
                if(head.next[check] == null){
                    head.next[check] = new TrieNode();
                }
                TrieNode next = head.next[check];

                head = next;
                if(i == word.length() - 1){
                    head.isLast = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                visited[i][j] = true;
                sb.append(board[i][j]);
                findWord(root, i, j, sb);
                visited[i][j] = false;
                sb.setLength(sb.length() - 1);
            }
        }

        return new ArrayList<>(answerSet);
    }

    private void findWord(TrieNode head, int r, int c, StringBuilder sb){
        char ch = board[r][c];
        int check = ch - 'a';
        if(head.next[check] == null){
            return;
        }

        head = head.next[check];

        if(head.isLast){
            answerSet.add(sb.toString());
        }

        for(int k = 0; k < dr.length; k++){
            int nextRow = r + dr[k];
            int nextCol = c + dc[k];
            if(nextRow >= 0 && nextRow < m
                    && nextCol >= 0 && nextCol < n
                    && !visited[nextRow][nextCol]){
                visited[nextRow][nextCol] = true;
                sb.append(board[nextRow][nextCol]);
                findWord(head, nextRow, nextCol, sb);
                visited[nextRow][nextCol] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    private static class TrieNode{
        TrieNode[] next;
        boolean isLast;

        TrieNode(){
            next = new TrieNode[26];
            isLast = false;
        }
    }

}