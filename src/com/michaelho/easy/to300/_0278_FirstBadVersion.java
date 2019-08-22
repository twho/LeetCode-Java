package com.michaelho.easy.to300;

public class _0278_FirstBadVersion {

    boolean[] versions;

    public _0278_FirstBadVersion(boolean[] versions){
        this.versions = versions;
    }

    int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start+(end-start)/2;
            if (isBadVersion(mid)) {
                if (!isBadVersion(mid-1))
                    return mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private boolean isBadVersion(int n) {
        if (n < 0)
            return false;
        return versions[n-1];
    }
}
