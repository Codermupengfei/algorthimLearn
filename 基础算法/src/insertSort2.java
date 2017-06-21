/**
 * Created by OovEver on 2017/6/20.
 * 插入排序改进
 * 以空间换时间
 * 在排序的过程中，每次要处理的数组中的数 保存一个副本
 * 与前面那个元素相比，看是否小于前面那个元素
 * 如果小于则将前面的那个元素放到该元素位置处，之后判断该位置是否小于前面位置的元素
 * 如果大于或者到0位置处，则将该元素放到该位置处
 */
public class insertSort2 {
    public static void insertSort2(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int e = arr[i];
            int j;
            for(j=i;j>0&&arr[j-1]>e;j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }
}
