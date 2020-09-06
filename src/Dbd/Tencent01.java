package Dbd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tencent01 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int m = sn.nextInt();
        int[] mm = new int[m];
        for(int i=0;i<m;i++){
            mm[i] = sn.nextInt();
        }
        int n = sn.nextInt();
        int[] nn = new int[n];
        for(int i=0;i<n;i++){
            nn[i] = sn.nextInt();
        }
        int i=0;
        int j=0;
        List<Integer> res = new ArrayList<>();
        while(i<m && j<n){
            while(i<m && j<n && mm[i]==nn[j]){
                res.add(mm[i]);
                i++;
                j++;
            }
            if(i<m && j<n && mm[i] > nn[j]){
                i++;
            }else if(i<m && j<n && mm[i] < nn[j]){
                j++;
            }
        }
        for(int k=0;k<res.size();k++){
            System.out.print(res.get(k));
            if(k!=res.size()-1){
                System.out.print(" ");
            }
        }
    }
}
