package Ada;

import java.util.HashMap;
import java.util.Map;

public class Main11 {
    public static int findDuplicatedNumber(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int n;
        for(int i = 0; i < nums.length; i++){
            n = map.getOrDefault(nums[i], 0);
            if(n != 0){
                return nums[i];
            }
            else{
                map.put(nums[i],1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findDuplicatedNumber(arr));
    }
}
