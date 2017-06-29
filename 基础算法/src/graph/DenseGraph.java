package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/6/27.
 */
public class DenseGraph {
//    n是定点,m是边
    private int n,m;
    private boolean directed;
    private ArrayList<List<Boolean>> g;

    public DenseGraph(int n, boolean directed) {
        this.n = n;
        this.m = 0;
        this.directed = directed;
        for(int i=0;i<n;i++) {
            List<Boolean> list = new ArrayList<>();
            for(int j=0;j<n;j++) {
                list.add(false);
            }
            g.add(list);
        }
    }
    public int v() {
        return n;
    }
    public int E() {
        return m;
    }

    public void addEdge(int v, int w) {
        assert (v >= 0 && v < n);
        assert (w >= 0 && w < n);
    }


}
