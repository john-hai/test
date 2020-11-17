import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 T || F && F || F
 ! F|| T && T
 T && F
 */

public class Ctrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        while(input !=null && input.length()>0){
            String[] inputs = input.trim().split("\\s+");
            System.out.println(calculate(inputs));
            input = in.nextLine();
        }
    }

    static HashMap<String, Integer> hm = new HashMap<>();
    static {
        hm.put(")", 0);
        hm.put("!", 1);
        hm.put("&&", 2);
        hm.put("||", 3);
    }

    static String calculate(String[] inputs){
        Deque<String> tAndf = new LinkedList<>();
        Deque<String> orAndAnd = new LinkedList<>();
        for(String curr:inputs){
            if(curr.equals("T") || curr.equals("F")){
                tAndf.push(curr);
            }else if(curr.equals("&&") || curr.equals("||")){
                if(orAndAnd.isEmpty()){
                    orAndAnd.push(curr);
                    continue;
                }
                String last = orAndAnd.peek();
                while(last!=null && hm.get(last) <= hm.get(curr)){
                    if(last.equals("!")){
                        orAndAnd.pop();
                        String temp1 = tAndf.pop();
                        temp1 = temp1.equals("T")?"F":"T";
                        tAndf.push(temp1);
                        last = orAndAnd.peek();
                    }else {
                        String temp1 = tAndf.pop();
                        String temp2 = tAndf.pop();
                        tAndf.push(helper(temp1,temp2,orAndAnd.pop()));
                        last = orAndAnd.peek();
                    }
                }
                orAndAnd.push(curr);
            }else if(curr.equals("(")){
                orAndAnd.push("(");
            }else if(curr.equals(")")){
                String last = orAndAnd.pop();
                while (last!="("){
                    if(last.equals("!")){
                        orAndAnd.pop();
                        String temp1 = tAndf.pop();
                        temp1 = temp1.equals("T")?"F":"T";
                        tAndf.push(temp1);
                        last = orAndAnd.peek();
                    }else {
                        String temp1 = tAndf.pop();
                        String temp2 = tAndf.pop();
                        tAndf.push(helper(temp1,temp2,orAndAnd.pop()));
                        last = orAndAnd.peek();
                    }
                }
            }
        }
        return helper(tAndf.pop(),tAndf.pop(),orAndAnd.pop());
    }

    static String helper(String temp1, String temp2, String x){
        boolean b1 = temp1.equals("T")?true:false;
        boolean b2 = temp2.equals("T")?true:false;
        boolean res;
        if(x.equals("||")){
            res = b1 || b2;
        }else{
            res = b1 && b2;
        }
        return  res?"T":"F";
    }
}
