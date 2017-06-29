package heap;

/**
 * Created by OovEver on 2017/6/26.
 */
public class heapSort {
   public static void heapSort1(int arr[]) {
        heap a = new heap(arr.length);
        for(int i=0;i<arr.length;i++) {
            a.insert(arr[i]);
        }
        for(int i=arr.length-1;i>=0;i--) {
            arr[i] = a.extraactMax();
        }
    }
    public static void heapSort2(int arr[]) {
        heap a = new heap(arr);
        for(int i=arr.length-1;i>=0;i--) {
            arr[i] = a.extraactMax();
        }
    }
}
