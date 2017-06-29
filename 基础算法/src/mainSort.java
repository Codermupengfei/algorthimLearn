import heap.heapSort;

/**
 * Created by OovEver on 2017/6/20.
 */
public class mainSort {
    public static void main(String[] args) {

        int n=50000;
        int[] a = SortTestHelper.genNearlyArray(n,10000);
        int[] a1 = SortTestHelper.copyIntarry(a);
        int[] a2 = SortTestHelper.copyIntarry(a);
        int[] a3 = SortTestHelper.copyIntarry(a);
        int[] a4 = SortTestHelper.copyIntarry(a);
        int[] a5 = SortTestHelper.copyIntarry(a);
        long starTime=System.currentTimeMillis();
        SelectSort.selectSort(a);
        long endTime=System.currentTimeMillis();
        assert (SortTestHelper.isSorted(a));
        System.out.println("选择排序"+"程序运行了"+(endTime-starTime)+"ms");
         starTime=System.currentTimeMillis();
        InsertSort.insertSort(a1);
         endTime=System.currentTimeMillis();
        System.out.println("插入排序"+"程序运行了"+(endTime-starTime)+"ms");
        starTime=System.currentTimeMillis();
        insertSort2.insertSort2(a2);
        endTime=System.currentTimeMillis();
        System.out.println("改进插入排序"+"程序运行了"+(endTime-starTime)+"ms");
        starTime=System.currentTimeMillis();
        MergeSort.mergeSort(a3,0,a3.length-1);
        assert (SortTestHelper.isSorted(a3));
        endTime=System.currentTimeMillis();
        System.out.println("归并排序"+"程序运行了"+(endTime-starTime)+"ms");
        starTime=System.currentTimeMillis();
        heapSort.heapSort1(a4);
        assert (SortTestHelper.isSorted(a4));
        endTime=System.currentTimeMillis();
        System.out.println("堆排序"+"程序运行了"+(endTime-starTime)+"ms");
        starTime=System.currentTimeMillis();
        heapSort.heapSort2(a5);
        assert (SortTestHelper.isSorted(a5));
        endTime=System.currentTimeMillis();
        System.out.println("堆排序2"+"程序运行了"+(endTime-starTime)+"ms");
    }
}
