package _04_Arrays.LectureQuestions;
import java.util.Arrays;

public class Swap {
    static void main(String[] args) {
        int[] arr = {1 , 3 , 5 , 7 , 9, 11};
        System.out.println("Initial Array");
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 5);
        System.out.println("Swapping indices 0 and 5");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
    }
}
