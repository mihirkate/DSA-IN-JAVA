public class MaxElementQueries {
    static int tree[];

    public static void print(int tree[]) {
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static void buildMaxTree(int i, int si, int sj, int arr[]) {
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }
        int mid = si + (sj - si) / 2;
        buildMaxTree(2 * i + 1, si, mid, arr);
        buildMaxTree(2 * i + 2, mid + 1, sj, arr);
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);

    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        // case 1 -no overlap
        if (si > qj || sj < qi) {
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) {
            return tree[i];
        } else {
            // case 3: partial Overlap
            int mid = si + (sj - si) / 2;
            int left = getMaxUtil((2 * i) + 1, si, mid, qi, qj);
            int right = getMaxUtil((2 * i) + 2, mid + 1, sj, qi, qj);
            return Math.max(left, right);
        }
    };

    public static void update(int arr[], int idx, int newVal) {
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n - 1, idx, newVal);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if (idx < si || idx > sj) {
            return;
        }
        if (si == sj) {
            tree[i] = newVal;
        }
        if (si != sj) {
            tree[i] = Math.max(tree[i], newVal);
            int mid = si + (sj - si) / 2;
            updateUtil((2 * i) + 1, si, mid, idx, newVal);
            updateUtil((2 * i) + 2, mid + 1, sj, idx, newVal);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };
        int n = arr.length;
        init(n);
        buildMaxTree(0, 0, n - 1, arr);

        int max = getMax(arr, 2, 5);
        System.out.println(max);
        update(arr, 2, 20);

        max = getMax(arr, 2, 20);
        System.out.println(max);
    }
}
