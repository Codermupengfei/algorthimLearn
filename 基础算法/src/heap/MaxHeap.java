package heap;

/**
 * Created by OovEver on 2017/6/25.
 */
class heap {
    private int []data;
    private int count;
    private int capacity;
    private void shiftUp(int k) {
        while (k>1&&data[k / 2] < data[k]) {
            int temp = data[k / 2];
            data[k / 2] = data[k];
            data[k] = temp;
            k = k / 2;
        }
    }

    void shiftDown(int k) {
        while (2 * k <= count) {
            int j = 2 * k;
            if (j + 1 <= count&&data[j+1]>data[j]) {
                j += 1;
            }
            if (data[k] >= data[j]) {
                break;
            }
            int temp = data[k];
            data[k] = data[j];
            data[j] = temp;
            k = j;
        }
    }
    public heap(int capacity) {
        data = new int[capacity+1];
        count = 0;
        this.capacity = capacity;
    }
    public heap(int arr[]) {
        data = new int[arr.length+1];
        this.capacity = arr.length;
        for(int i=0;i<arr.length;i++) {
            data[i + 1] = arr[i];
        }
        count = arr.length;
        for(int i=count/2;i>=1;i--) {
            shiftDown(i);
        }
    }
    int size(){
        return count;
    }
    boolean isEmpty() {
        return count == 0;
    }

    void insert(int item) {
        assert (count + 1 <= capacity);
        data[count + 1] = item;
        count++;
        shiftUp(count);
    }
     int extraactMax() {
         int ret = data[1];
         int temp = data[1];
         data[1] = data[count];
         data[count] = temp;
         count--;
         shiftDown(1);
         return ret;
    }
}
public class MaxHeap {
    public static void main(String[] args) {
        heap a = new heap(100);
      for(int i=0;i<15;i++) {
          a.insert(i);
      }
        while (!a.isEmpty()) {
            System.out.println(a.extraactMax());
        }
        System.out.println(a.size());
    }
}
