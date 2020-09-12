package Dbd;

import java.util.Scanner;

/**
abda
 */
public class VIVO01 {

    private static int  temp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        boolean ans = ishuiwen(s, false, 0, s.length()-1);
        if(ans){
            if(temp==0){
                System.out.println(s);
            }else{
                System.out.println(s.substring(0,temp)+s.substring(temp+1));
            }
        }else{
            System.out.println(false);
        }

    }

    public static boolean ishuiwen(String s, boolean deteled, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(deteled){
                    return false;
                }else{
                    boolean left = ishuiwen(s, true, i+1, j);
                    boolean right = ishuiwen(s, true, i, j-1);
                    if(left){
                        temp = i;
                        return true;
                    }else if(right){
                        temp = j;
                        return true;
                    }else{
                        return false;
                    }
                }
            }
            i++;
            j--;
        }
        return true;
    }
}
