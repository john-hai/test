package Ada;
/**
 8 2 5
 5 5 5 4 5 5 5 5
 */

import java.util.Scanner;

public class Meituan2 {
    public static int isRight(int[] array, int a, int b, int k){
        for(int i = b; i >= 0; i--){
            if(array[i] < k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] beauty = new int[n];
        for(int i = 0 ; i < n; i++){
            beauty[i] = sc.nextInt();
        }
        int l = 0;
        int r = m - 1;
        int val;
        int count = 0;
        while(r < beauty.length){
            val = isRight(beauty, l, r, k);
            if(val == -1){
                count++;
                l++;
                r++;
                if(r < beauty.length && beauty[r] < k){
                    l = r + 1;
                    r = r + m;
                }
            }
            else{
                l = val + 1;
                r = m + val;
            }
        }
        System.out.print(count);
    }
}

