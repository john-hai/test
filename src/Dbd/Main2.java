package Dbd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        Pair[][] memoPair = new Pair[n][m];
        boolean[][] used = new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp = scanner.nextInt();
                if(temp ==1 ){
                    count++;
                }
                memoPair[i][j] = new Pair(i, j, temp, null);
            }
        }
        List<Pair> pairs;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!used[i][j] && memoPair[i][j].value==1){
                    pairs = new ArrayList<>();
                    dfs(pairs, memoPair, i, j, used, memoPair[i][j]);
                }
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(memoPair[i][j].value==0){
                    HashSet<Pair> hs = new HashSet();
                    int xx = 0;
                    hs.add(getHead(memoPair, i+1, j));
                    hs.add(getHead(memoPair, i-1, j));
                    hs.add(getHead(memoPair, i, j+1));
                    hs.add(getHead(memoPair, i, j-1));
                    for(Pair pair:hs){
                        if (pair!=null) xx += pair.value;
                    }
                    max = Math.max(max, xx+1);
                }
            }
        }
        System.out.println(Math.min(max, count));

    }

    public static void dfs(List<Pair> pairs, Pair[][] memoPair, int i, int j, boolean[][] used, Pair head){
        if(i<0 || j<0 || i>=memoPair.length || j>=memoPair[0].length || used[i][j]){
            return;
        }
        used[i][j] = true;
        if(memoPair[i][j].value ==0){
            return;
        }
        pairs.add(memoPair[i][j]);
        if(head.x != i || head.y != j){
            memoPair[i][j].head = head;
        }
        dfs(pairs, memoPair, i+1, j, used, head);
        dfs(pairs, memoPair, i-1, j, used, head);
        dfs(pairs, memoPair, i, j+1, used, head);
        dfs(pairs, memoPair, i, j-1, used, head);
        for(Pair pair:pairs){
            pair.value = pairs.size();
        }
    }

    public static Pair  getHead(Pair[][] memoPair, int i, int j){
        if(i<0 || j<0 || i>=memoPair.length || j>=memoPair[0].length){
            return null ;
        }
        return memoPair[i][j].head;
    }

    private static class Pair{
        private int value;
        private int x;
        private int y;
        private Pair head;
        private  Pair(int x, int y, int value,Pair head){
            this.x = x;
            this.y = y;
            this.value = value;
            this.head = head;
        }
    }
}
