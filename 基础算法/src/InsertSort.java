/**
 * Created by OovEver on 2017/6/20.
 * 插入排序
 * 后一个元素与前一个元素对比
 * 比前一个元素小则交换
 * 否则放到前一个元素后面
 */
public class InsertSort {
    public static void insertSort(int []arr){
        int len = arr.length;
        for(int i=1;i<len;i++) {
            for(int j=i;j>0;j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = temp;
                }else
                    break;
            }
        }
    }
}
