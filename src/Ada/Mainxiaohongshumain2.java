package Ada;

import java.util.ArrayList;

public class Mainxiaohongshumain2 {
    static int solution(String s) {
        if(s == null){
            return -1;
        }
        if(s == ""){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);
        if(firstChar == lastChar){
            return 1;
        }
        int i = 0;
        int j = s.length() - 1;
        int firstCharPos = 0;
        int lastCharPos = 0;
        ArrayList<Integer> firstCharPosArray = new ArrayList<>();
        ArrayList<Integer> lastCharPosArray = new ArrayList<>();
        while(i < j){
            if(s.charAt(i) == firstChar){
                firstCharPos = i;
                firstCharPosArray.add(i);
            }
            if(s.charAt(i) == lastChar){
                lastCharPos = i;
                lastCharPosArray.add(i);
            }
            if(s.charAt(j) == firstChar){
                firstCharPos = j;
                firstCharPosArray.add(j);
            }
            if(s.charAt(j) == lastChar){
                lastCharPos = j;
                lastCharPosArray.add(j);
            }
            i++;
            j--;
        }
        //乱写的
        return 1;
    }
}
