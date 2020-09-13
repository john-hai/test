package meituan;

import java.util.Scanner;

/**
 8 2 5
 5 5 5 4 5 5 5 5
 */
public class MT02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m =scanner.nextInt();
        int val = scanner.nextInt();
        int[] memo = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            memo[i] = scanner.nextInt();
        }
        int i=0;
        int j=0;
        boolean fail = false;
        for(;i<=n-m;){
            for(;j<m;j++){
                if(memo[i+j]<val){
                    fail=true;
                    break;
                }
            }
            if(fail){
                fail=false;
                i=i+j+1;
                j=0;
            }else{
                count++;
                j=m-1;
                i++;
            }
        }
        System.out.println(count);

    }
}
