package Ada;
import java.util.*;


public class Mainb3 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串
     * @return int整型
     */
    public static int GetFragment (String str) {
        if(str.length() == 1){
            return 1;
        }
        char c = str.charAt(0);
        int countOfPiece = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != c){
                countOfPiece++;
                c = str.charAt(i);
            }
        }
        return str.length()/countOfPiece;
    }

    public static void main(String[] args) {
        String str = "aaabbaaac";
        System.out.print(GetFragment(str));
    }
}
