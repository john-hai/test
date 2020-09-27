package huyu;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 2
 10
 open libc.so
 open libm.so
 open libdl.so
 dup 2
 dup2 0 2
 close 0
 query 1
 query 2
 query 3
 open log.txt
 10
 open output.txt
 dup2 0 1000000
 close 0
 open output2.txt
 dup2 0 100000
 close 0
 open 1.txt
 dup 100000
 query 1
 query 0


 0
 1
 2
 3
 libm.so
 libc.so
 libdl.so
 0
 0
 0
 0
 1
 output2.txt
 1.txt
 */
public class HUYU02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int m = scanner.nextInt();
            scanner.nextLine();
            String[] fd = new String[1000001];
            PriorityQueue<Integer> ts = new PriorityQueue<>();
            int index = 0;
            for(int j=0;j<m;j++){
                while(index<fd.length && fd[index]!=null) index++;
                while (!ts.isEmpty() && fd[ts.peek()]!=null) ts.poll();
                String[] ss= scanner.nextLine().trim().split(" ");
                switch (ss[0]){
                    case "open":
                        if(!ts.isEmpty() && ts.peek()<index){
                            int temp = ts.poll();
                            fd[temp]=ss[1];
                            System.out.println(temp);
                        }else{
                            fd[index]=ss[1];
                            System.out.println(index++);
                        }
                        break;
                    case "dup":
                        if(!ts.isEmpty() && ts.peek()<index){
                            int temp = ts.poll();
                            fd[temp]=fd[Integer.parseInt(ss[1])];
                            System.out.println(temp);
                        }else{
                            fd[index]=fd[Integer.parseInt(ss[1])];
                            System.out.println(index++);
                        }
                        break;
                    case "dup2":
                        int temp = Integer.parseInt(ss[2]);
                        fd[temp]=fd[Integer.parseInt(ss[1])];
                        break;
                    case "close":
                        int temp2 = Integer.parseInt(ss[1]);
                        fd[temp2]=null;
                        if(temp2<index) ts.add(temp2);
                        break;
                    case "query":
                        System.out.println(fd[Integer.parseInt(ss[1])]);
                        break;
                }
            }
        }
    }
}
