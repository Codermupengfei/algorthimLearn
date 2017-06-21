/**
 * Created by OovEver on 2017/6/20.
 * 归并排序
 * 分半，归并，剩下一个元素之后进行归并，逐层归并
 * 两种优化方式
 * 1.当arr[mid]>arr[mid+1]进行归并排序
 * 2.当数小到一定程度时进行插入排序
 */
public class MergeSort {
    static  void merge(int []arr,int l,int mid,int r) {
        int[] temp = new int[r - l + 1];
        for(int i=l;i<=r;i++) {
            temp[i - l] = arr[i];
        }
        int i = l, j = mid + 1;
        for(int k=l;k<=r;k++) {
            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            }
            else if (arr[k] > temp[k - l]) {
                arr[k] = temp[i - l];
                i++;
            }else {
                arr[k] = temp[j - l];
                j++;
            }
        }
    }
   static void mergeSort(int []arr,int l,int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
       //优化
       if(arr[mid]>arr[mid+1])
        merge(arr,l,mid,r);
    }
}
