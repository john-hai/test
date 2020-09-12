package Ada;
import java.util.Scanner;
public class Vivo1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.print(Math.abs(a - c)+Math.abs(b - d));
    }
}
