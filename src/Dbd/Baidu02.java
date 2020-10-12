package Baidu;

import java.util.HashSet;
import java.util.Scanner;

/**
 4 3 4
 1 2
 2 3
 4 3

 1 2 3
 */
public class Baidu02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int time = scanner.nextInt();
        int num = scanner.nextInt();
        Member[] members = new Member[n+1];
        for(int i=1;i<=n;i++){
            members[i] = new Member(i);
        }
        for(int i=0;i<time;i++){
            int winner = scanner.nextInt();
            int loser = scanner.nextInt();
            members[winner].losers.add(members[loser]);
            members[loser].winners.add(members[winner]);
        }
        int x = members[num].countWinner();
        int y  = members[num].countLoser();
        for(int i=x;i<n-y;i++){
            System.out.print(i+1+" ");
        }

    }

    private static class Member{

        int num;
        HashSet<Member> winners = new HashSet<>();
        HashSet<Member> losers = new HashSet<>();
        Member(int i){
            this.num = i;
        }

        int countWinner(){
            int temp = winners.size();
            for(Member m:winners){
                temp+=m.countWinner();
            }
            return temp;
        }

        int countLoser(){
            int temp = losers.size();
            for(Member m:losers){
                temp+=m.countLoser();
            }
            return temp;
        }
    }

}
