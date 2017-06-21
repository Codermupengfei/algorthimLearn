import java.util.Random;

/**
 * Created by OovEver on 2017/6/20.
 * 生成随机测试数据
 * 生成n个范围在rangeL到rangeR中
 */
public class SortTestHelper {
   public  static int []genRandomArray(int n,int rangeL,int rangeR){
        int[] arr = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++) {
            arr[i]=random.nextInt(rangeR)%(rangeR-rangeL)+rangeL;
        }
        return arr;
    }
    /**
     * 测试算法性能
     */
    public  static void testSort(){
        long starTime=System.currentTimeMillis();
        long endTime=System.currentTimeMillis();
    }
    /**
     * 判断是否有序
     * */
   static boolean isSorted(int []arr){
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }

        }
        return true;
    }
/**
 * 拷贝数组
 * */
    public static int[] copyIntarry(int a[]) {
        int[] arr = new int[a.length];
        arr = a;
        return arr;
    }

    /**
     * 有序随机数组
     */
   static int[] genNearlyArray(int n, int swapTimes) {
        int[] arr = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++) {
            arr[i] = i;
        }
        for(int i=0;i<swapTimes;i++) {
            int posx=random.nextInt(n);
            int posy=random.nextInt(n);
            int temp = arr[posx];
            arr[posx] = arr[posy];
            arr[posy] = temp;
        }
        return arr;
    }
}
