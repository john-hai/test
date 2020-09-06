package Ada;

import java.util.*;

public class Mainhw3 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
//        double max = sc.nextInt();
//        double n = sc.nextInt();
        //String mn = sc.nextLine();
        double max = 9;
        int n = 5;
        double[] arrayOfSize = {2,2,4,6,3};
        double[] arrayOfValue = {3,4,8,9,6};
        double[] array = new double[n];
        Map<Integer, Double> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            array[i] = arrayOfValue[i]/arrayOfSize[i];
            map.put(i, array[i]);
        }
        List<Map.Entry<Integer, Double>> list = new ArrayList<Map.Entry<Integer, Double>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                if(o1.getValue() > o2.getValue()){
                    return -1;
                }
                else if(o1.getValue() < o2.getValue()){
                    return 1;
                }
                else{
                    if(arrayOfSize[o1.getKey()] > arrayOfSize[o2.getKey()]){
                        return -1;
                    }
                    else if(arrayOfSize[o1.getKey()] < arrayOfSize[o2.getKey()]){
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
            }
        });
        double sum = 0;
        double capacity = 0;
        for(Map.Entry<Integer, Double> t:list){
            if(capacity + arrayOfSize[t.getKey()] <  max){
                sum = sum + arrayOfValue[t.getKey()];
                capacity = capacity + arrayOfSize[t.getKey()];
            }
        }
        System.out.print(sum);

    }
}
