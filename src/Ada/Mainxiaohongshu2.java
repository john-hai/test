package Ada;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Mainxiaohongshu2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/

    /**
     *
     * @param s
     * @return
     */
    static class CharPosition{
        int first = 0;
        int last = 0;

        public int getLen(){
            return last - first + 1;
        }
    }
    static int solution(String s) {
        if(s == null){
            return -1;
        }
        Map<Character, CharPosition> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            CharPosition charPosition = map.get(s.charAt(i));
            if(charPosition == null){
                charPosition = new CharPosition();
                charPosition.first = i;
                map.put(s.charAt(i), charPosition);
            }
            charPosition.last = i;
        }
        //乱写的
        return 1;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = solution(_s);
        System.out.println(String.valueOf(res));

    }
}
