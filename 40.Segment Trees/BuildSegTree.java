public class BuildSegTree {
    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static int buildSegTree(int arr[], int i, int start, int end) {

        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start + end) / 2;
        buildSegTree(arr, 2 * i + 1, start, mid);
        buildSegTree(arr, 2 * i + 2, mid + 1, end);
        tree[i] = tree[(2 * i) + 1] + tree[(2 * i) + 2];
        return tree[i];
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        // case 1 non overlapping case
        if (qj <= si || qi >= sj) {
            return 0;
        }
        // case 2 complete overlapp
        else if (si >= qi && sj <= qj) {
            return tree[i];
        }
        // case 3 partial overlapp
        else {
            int mid = (si + sj) / 2;
            int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
            int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return left + right;
        }
    }

    public static int getSum(int arr[], int qi, int qj) {
        int n = arr.length;
        return getSumUtil(0, 0, n - 1, qi, qj);

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void update(int arr[], int idx, int newVal) {
        // O(logn)
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal;
        updateUtil(0, 0, n - 1, idx, diff);// segment tree updatation
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if (idx > sj || idx < si) {
            return;
        }
        tree[i] += diff;
        if (si != sj) {
            // non leaf
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, diff);
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        init(n);
        System.out.println("Segment Tree is " + buildSegTree(arr, 0, 0, n - 1));
        print(tree);
        System.out.println();
        System.out.println(getSum(arr, 2, 5));
        update(arr, 2, 2);
        System.out.println(getSum(arr, 2, 5));
        print(tree);
    }
}