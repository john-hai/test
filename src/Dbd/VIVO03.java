package Dbd;


import java.util.ArrayList;
import java.util.HashSet;


public class VIVO03 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 编译顺序
     * @param input string字符串
     * @return string字符串
     *
     *
     *"1,2,-1,1"
     *"2,1,0,3"
     */
    public static String compileSeq (String input) {
        // write code here
        String[] ss = input.split(",");
        int len = ss.length;
        boolean[] used = new boolean[len];
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> target = new HashSet<>();
        target.add(-1);
        for(int i=0;ans.size()<len;i=(i+1)%len){
            if(used[i]) continue;
            int temp = Integer.parseInt(ss[i]);
            if(target.contains(temp)){
                ans.add(i);
                target.add(i);
                used[i]=true;
                i=-1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i:ans){
            stringBuilder.append(",").append(i);
        }
        return  stringBuilder.toString().substring(1);
    }

    public static void main(String[] args) {
        System.out.println(compileSeq("1,2,-1,1"));
    }
}
