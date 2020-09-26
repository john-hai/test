package meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
3
9 3
1 4
2 5

 2 1
 */
public class MT05 {
    private static class Task{
        int id;
        int priority;
        int necce;
        public Task(int id, int priority, int necessary){
            this.id = id;
            this.priority = priority;
            this.necessary = necessary;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Task> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            Task temp = new Task(i+1, scanner.nextInt(), scanner.nextInt());
            list.add(temp);
        }
        // System.out.println(li);
        list.sort((Task a, Task b)->{
            if(a.necessary>b.necessary){
                return -1;
            }else if(a.necessary==b.necessary){
                if(a.priority>b.priority){
                    return -1;
                }else if(a.priority==b.priority){
                    return 0;
                }else{
                    return 1;
                }
            }else{
                return 1;
            }
        });
        //System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(lisst.get(i).id);
            if(i<list.size()-1) System.out.print(" ");
        }
    }
}
