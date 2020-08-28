import java.util.Scanner;

public class sum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a, b;
        for(int i = 0; i < count; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            a = a + b;
            System.out.println(a);
        }
    }
}
