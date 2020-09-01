import java.util.*;

public class Main3 {
    //123112111
    public static int Longgest(String str){
        if(str == null){
            return -1;
        }
        if(str.length() == 0){
            return 0;
        }
        if(str.length() == 1){
            return 1;
        }
        if(str.length() == 2){
            return 2;
        }

        for(int i = 0; i < str.length(); i++){

        }



        int i = 1;
        int j = 0;
        int c = 0;
        Map map1 = new HashMap<Integer, Integer>();
        Map map2 = new HashMap<Integer, Integer>();


        map1.put(Integer.parseInt(str.substring(0, 1)), 1);
        for(int i = 1; i < str.length(); i++){
            c = Integer.parseInt(str.substring(j, j+1));
            if(str.charAt(i) != str.charAt(i - 1)&&str.charAt(i) != str.charAt(i + 1)){

            }
            if(str.charAt(i) == str.charAt(i - 1)&&str.charAt(i) != str.charAt(i + 1)){

            }
        }
        // int a = Integer.parseInt("1");
        while(i < str.length()){
            if(str.charAt(i) == str.charAt(j)){
                i++;
            }
            else{
                c = Integer.parseInt(str.substring(j, j+1));
                int a = (int)map1.getOrDefault(c, 0);
                if(a < (i-j)){
                    map1.put(c, (i-j));
                    map2.put(c, j);
                }
                j = i;
                i++;
            }
        }
        if(i == str.length()){
            c = Integer.parseInt(str.substring(j, j+1));
            int a = (int)map1.getOrDefault(c, 0);
            if(a < (i-j)){
                map1.put(c, (i-j));
                map2.put(c, j);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList(map1.entrySet());
        Collections.sort(list, (o1, o2) -> (o1.getValue() - o2.getValue()));
        int m = list.get(list.size() - 1).getKey();
        int n = (int)map2.get(m);
        if(n == 0){
            //考察尾部
            if(n + (int)map1.get(m)  < str.length()){
            }
        }
        else{

        }
    }
    public static void main(String[] args) {
        String str = "123112111";
        System.out.println(Longgest(str));
    }
}
