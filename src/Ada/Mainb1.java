package Ada;

import java.util.*;


public class Mainb1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param arr int整型一维数组
     * @param k int整型 允许0变为1的个数
     * @return int整型
     */
    public int GetMaxConsecutiveOnes (int[] arr, int k) {
        // 统计0的个数
        int countZero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                countZero++;
            }
        }
        if(k >= countZero){
            return arr.length;
        }
        return arr.length - 1;
    }
}
