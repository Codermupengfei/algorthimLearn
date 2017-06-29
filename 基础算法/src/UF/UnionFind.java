package UF;

/**
 * Created by OovEver on 2017/6/26.
 */
public class UnionFind {
    private int[] id;
    private int count;

    public UnionFind(int n) {
        count = n;
        id = new int[n];
        for(int i=0;i<n;i++) {
            id[i] = i;
        }
    }

    int find(int p) {
        assert (p >=0 && p < count);
        return id[p];
    }

    boolean idConnected(int p, int q) {
        return find(p) == find(q);
    }

    void unionElements(int p, int q) {
        int pID = find(p);
        int qId = find(q);
        if (pID == qId) {
            return;
        }
        for(int i=0;i<count;i++) {
            if (id[i] == pID) {
                id[i] = qId;
            }
        }


    }

    public static void main(String[] args) {

    }
}
