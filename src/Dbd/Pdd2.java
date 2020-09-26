package PDD;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**

 5 6
 X00100
 00000X
 01T000
 0X1010
 00000X


 4

 0015
 */
public class Pdd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        char[][] map = new char[n][m];
        int[][] used = new int[n][m];
        int x = -1;
        int y = -1;
        for(int i=0;i<n;i++){
            String row = scanner.next();
            for(int j=0;j<m;j++){
                if(row.charAt(j)=='T'){
                    x=i;
                    y=j;
                }else if(row.charAt(j)=='1'){
                    used[i][j]=-1;
                }
                map[i][j] = row.charAt(j);
            }
        }
        int dist = bfs(map, used, x, y);
        System.out.println(dist-2);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(used[i][j]==dist-1 && map[i][j]== 'X'){
                    System.out.print(i + " " + j +" ");
                }
            }
        }
    }

    public static int bfs(char[][] map, int[][] used, int x, int y){
        Deque<Node> quque = new LinkedList<>();
        quque.add(new Node(x,y));
        boolean end = false;
        int distance = 1;
        while(!end && !quque.isEmpty()){
            Deque<Node> quque2 = new LinkedList<>();
            while (!quque.isEmpty()){
                Node curr = quque.poll();
                int i=curr.x;
                int j=curr.y;
                if(i<0 || j<0 || i>=map.length || j>=map[0].length || used[i][j]!=0){
                    continue;
                }
                used[i][j] = distance;
                if(map[i][j]=='X'){
                    end = true;
                    continue;
                }
                quque2.add(new Node(i+1,j));
                quque2.add(new Node(i-1,j));
                quque2.add(new Node(i,j+1));
                quque2.add(new Node(i,j-1));
            }
            quque = quque2;
            distance++;
        }
        return distance;

    }

    public static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
