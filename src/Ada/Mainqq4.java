package Ada;

import java.util.Arrays;
import java.util.Scanner;

public class Mainqq4 {
    public static int find(int a, int[] array){
        int[] arr = array;
//        Arrays.sort(arr);
        int[] afterDeleted = remove(arr, a);
        return afterDeleted[array.length/2 - 1];
    }

    public static int[] remove(int[] arr, int num){
        int[] temp = new int[arr.length - 1];
        int idx = 0;
        boolean hasRemoved = false;
        for(int i = 0; i < arr.length;i++){
            if(!hasRemoved && arr[i] == num){
                hasRemoved = true;
                continue;
            }
            temp[idx++] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] sortedArray = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            sortedArray[i] = array[i];
        }
        Arrays.sort(sortedArray);
        for(int i = 0; i < n; i++){
            System.out.println(find(array[i], sortedArray));
        }
//        int n = 6;
//        int[] array = {4,5,8,7,3,4};
//        System.out.println(find(5, array));
//        for(int i:array){
//            System.out.println(find(i, array));
//        }
//        for(int i = 0; i < array.length; i++){
//            System.out.println(find(array[i], array));
//        }
    }
}
