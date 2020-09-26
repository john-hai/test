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
        int[] array = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        int i=0;
        int j=0;
        boolean judge = false;
        while(i <= n-m){
            for( ;j<m;j++){
                if(array[i+j]<val){
                    judge = true;
                    break;
                }
            }
            if(judge){
                judge=false;
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
