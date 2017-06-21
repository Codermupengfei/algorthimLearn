/**
 * Created by OovEver on 2017/6/21.
 * 迭代法归并排序
 * 对链表应用较好
 */
public class MergeSort2 {
    void mergeSortBu(int []arr) {
        for(int sz=1;sz<=arr.length-1;sz+=sz) {
            for(int i=0;i+sz<arr.length;i+=sz+sz) {
                MergeSort.merge(arr,i,i+sz-1,Math.min(i+sz+sz-1,arr.length-1));
            }
        }
    }
}
