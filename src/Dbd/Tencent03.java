package Dbd;

import java.util.*;

public class Tencent03 {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int k = sn.nextInt();
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            String temp = sn.next();
            if(hm.containsKey(temp)){
                hm.put(temp,hm.get(temp)+1);
            }else{
                hm.put(temp,1);
            }
        }
        List<Map.Entry<String,Integer>> li = new ArrayList<>();
        for(Map.Entry entry: hm.entrySet()){
            li.add(entry);
        }
        li.sort((Map.Entry a, Map.Entry b)->{
            int ia = (int) a.getValue();
            int ib = (int) b.getValue();
            return ia>ib?-1:ia==ib?0:1;
        });
        for(int i=0;i<k;i++){
            System.out.print(li.get(i).getKey());
            System.out.print(" ");
            System.out.println(li.get(i).getValue());
        }
        li.sort((Map.Entry a, Map.Entry b)->{
            int ia = (int) a.getValue();
            int ib = (int) b.getValue();
            return ia>ib?1:ia==ib?0:-1;
        });
        for(int i=0;i<k;i++){
            System.out.print(li.get(i).getKey());
            System.out.print(" ");
            System.out.println(li.get(i).getValue());
        }
    }
=======
        public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
            int n = sn.nextInt();
            int k = sn.nextInt();
            HashMap<String, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String temp = sn.next();
                if (hm.containsKey(temp)) {
                    hm.put(temp, hm.get(temp) + 1);
                } else {
                    hm.put(temp, 1);
                }
            }
            List<Map.Entry<String, Integer>> li = new ArrayList<>();
            for (Map.Entry entry : hm.entrySet()) {
                li.add(entry);
            }
            li.sort((Map.Entry a, Map.Entry b) -> {
                int ia = (int) a.getValue();
                int ib = (int) b.getValue();
                return ia > ib ? -1 : ia == ib ? 0 : 1;
            });
            for (int i = 0; i < k; i++) {
                System.out.print(li.get(i).getKey());
                System.out.print(" ");
                System.out.println(li.get(i).getValue());
            }
            li.sort((Map.Entry a, Map.Entry b) -> {
                int ia = (int) a.getValue();
                int ib = (int) b.getValue();
                return ia > ib ? 1 : ia == ib ? 0 : -1;
            });
            for (int i = 0; i < k; i++) {
                System.out.print(li.get(i).getKey());
                System.out.print(" ");
                System.out.println(li.get(i).getValue());
            }
        }
>>>>>>> f1800c9c24e41b88bc57eea3cb36153ea38d36fa
}
