package Dbd;

import java.util.Scanner;

/**
 *
6 2
3 1 4 2 5 6

 1 2 6 3 4 5
 */
public class Yuan01 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int time = sn.nextInt();
        int[] memo = new int[n];
        for(int i=0;i<n;i++){
            memo[i] = sn.nextInt();
        }
        for(int i=0; i<time;i++){
            memo = shuffle(memo);
        }
        for(int i=0;i<n;i++){
            if(i==n-1) {
                System.out.print(memo[i]);
                break;
            }
            System.out.print(memo[i]+" ");
        }
    }

    public static int[] shuffle(int[] memo){
        int len = memo.length;
        int[] copy = new int[len];
        int step = len/2;
        int limit = len%2==0?len:len-1;
        for(int i=0,j=0;i<limit;i+=2,j++){
            copy[i] = memo[j+step];
            copy[i+1] = memo[j];
        }
        if(len%2==1){
            copy[len-1] = memo[len-1];
        }
        return copy;
    }

}
