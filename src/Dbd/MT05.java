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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Task> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            Task temp = new Task(i+1, scanner.nextInt(), scanner.nextInt());
            li.add(temp);
        }
        System.out.println(li);
        li.sort((Task a, Task b)->{
            if(a.necce>b.necce){
                return -1;
            }else if(a.necce==b.necce){
                if(a.prior>b.prior){
                    return -1;
                }else if(a.prior==b.prior){
                    return 0;
                }else{
                    return 1;
                }
            }else{
                return 1;
            }
        });
        System.out.println(li);
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i).id);
            if(i<li.size()-1) System.out.print(" ");
        }
    }

    private static class Task{
        int id;
        int prior;
        int necce;
        public Task(int id, int prior, int necce){
            this.id = id;
            this.prior = prior;
            this.necce = necce;
        }
    }
}
