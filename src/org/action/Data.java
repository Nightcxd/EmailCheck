package org.action;

/**
 * Created by cxd on 2016/11/22.
 */
public class Data {
    private int n;
    private int m;

    public Data(int n, int m) {
        this.m = m;
        this.n = n;
    }

    @Override
    public String toString() {
       int r=n/m;
        return n+"/"+m+"="+r;
    }
}
