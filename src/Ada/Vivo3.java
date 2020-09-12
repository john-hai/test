package Ada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vivo3 {
   // 1 2 -1 1
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       String string = scanner.nextLine();
       String[] temp;
       temp = string.split(",");
       Map<Integer, Integer> map1 = new HashMap<>();
       Map<Integer, ArrayList<Integer>> map2 = new HashMap<>();
       for(int i = 0; i < temp.length; i++){
           map1.put(i, Integer.parseInt(temp[i]));
           if(Integer.parseInt(temp[i]))
       }


   }
}
