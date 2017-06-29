/**
 * Created by OovEver on 2017/6/21.
 * 高级排序算法到低层可以进行插入排序算法进行排序
 */
public class quickSort {
    int partition(int arr[], int l, int r) {
        int v = arr[l];
        int j = l;
        for(int i=l+1;i<=r;i++) {
            if (arr[i] < v) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        return j;
    }
    void quickSort(int arr[],int l,int r) {
        if (l >= r) {
            return;
        }
        int mid = partition(arr, l, r);
        quickSort(arr, l, mid - 1);
        quickSort(arr, mid + 1, r);

    }
}
