package Ada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Mainqq4 {
    public static int find(int a, int[] array){
        int[] arr = array;
        int[] afterDeleted = remove1(arr, a);
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

    public static int[] remove1(int[] arr, int num){
        int[] temp = new int[arr.length - 1];
        int idx = 0;
        boolean hasRemoved = false;
        int index = binarySearch(arr, num);
        List list = Arrays.asList(arr);
        list.remove(index);
        for(int i = 0; i < list.size(); i++){
            temp[i] = (int)list.get(i);
        }
        //temp = list.stream().mapToInt(int::valueOf).toArray();
//        for(int i = 0; i < index;i++){
//            temp[idx++] = arr[i];
//        }
//        for(int i = index + 1; i < arr.length;i++){
////            if(!hasRemoved && arr[i] == num){
////                hasRemoved = true;
////                continue;
////            }
//            temp[idx++] = arr[i];
//        }
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
