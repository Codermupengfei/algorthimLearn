/**
 * Created by OovEver on 2017/6/20.
 * 选择排序
 * 思路：
 * 每次找到最小的一个，和当前未排序的最小的元素进行交换
 */

public class SelectSort {
    static void selectSort(int []arr){
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int minIndex=i;
            for(int j=i+1;j<n;j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

    }
}
