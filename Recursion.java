public class Recursion {
    public static void printDecNo(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecNo(n - 1);
    }

    public static void printIncNo(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncNo(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {

            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * factorial(n - 1);

        return fn;
    }

    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int f = n + factorial(n - 1);
        System.out.println(f);
        return f;
    }

    public static int fibo(int n) {

        if (n == 1 || n == 0) {
            return n;

        }
        int fib3 = fibo(n - 1) + fibo(n - 2);
        return fib3;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            System.out.println("array is not sorted ");
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int i, int key) {
        if (i == arr.length) {

            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, i + 1, key);

    }

    public static int lastOccurence(int arr[], int i, int key) {
        if (i == arr.length) {

            return -1;
        }
        int isFound = lastOccurence(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }

    public static int tileProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } // choices
          // 1-> vertical hai aur 2->Horizontal hai
          // vertical->f(n-1)-->fnm1
        int fnm1 = tileProblem(n - 1);
        // horizontal-->f(n-2)-->fnm2
        int fnm2 = tileProblem(n - 2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void removeDupsFrmString(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {// base Case
            System.out.println(newstr);
            return;
        }
        // kaam
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            // duplicate exist
            removeDupsFrmString(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeDupsFrmString(str, idx + 1, newstr.append(currchar), map);
        }
    }

    public static int friendsProblem(int n) {
        // pairing of friends Problem Asked in GolmanSachs
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        // choice ->Single|| paired
        // single
        int fnm1 = friendsProblem(n - 1);
        // paired
        int fnm2 = friendsProblem(n - 2);
        // total ways
        int totWays = fnm1 + (n - 1) * fnm2;
        return totWays;
    }

    public static void printBinaryNo(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryNo(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printBinaryNo(n - 1, 1, str + "1");
        }
    }

    // questions from The assignments
    // find all occurence of the array
    public static void allOccurence(int arr[], int i, int key) {
        // base case
        if (i == arr.length) {
            return;
        }
        // kaam
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        // calling function
        allOccurence(arr, i + 1, key);
    }

    public static void noToString(int i, int n) {
        String arr[] = { "zero", "one", "two", "Three", "four", "five", "six", "seven", "eight", "nine", "ten" };

        // base
        if (n == 0) {
            return;
        }
        // kaam
        i = n % 10;
        noToString(i, n / 10);
        System.out.print(" " + arr[i]);
    }

    public static void towerOfHanoi(int n, String src, String help, String dest) {

        if (n == 1) {
            System.out.println("transfer disk " + n + "from " + src + " to " + help);
            return;
        }
        towerOfHanoi(n - 1, src, dest, help);
        System.out.println("transfer disk " + n + "from " + src + " to " + help);
        towerOfHanoi(n - 1, help, src, dest);

    }

    public static void main(String[] args) {
        // printDecNo(11);
        // printIncNo(5);
        // factorial(8);
        // int factorial = factorial(5);
        // System.out.println(factorial);
        // sumNatural(3);
        System.out.println(fibo(5));
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // System.out.println(i sSorted(arr, 0));
        // System.out.println("The key is at index:"+firstOccurence(arr, 0, 5));
        // System.out.println(lastOccurence(arr, 0, 4));
        // System.out.println(power(2, 10));
        // System.out.println(tileProblem(2));
        // String str = "appnnacollege";
        // removeDupsFrmString(str, 0, new StringBuilder(" "), new boolean[26]);
        // System.out.println(friendsProblem(4));
        // printBinaryNo(3, 0, "");
        // allOccurence(arr, 0, 2);
        // noToString(0, 4567);
        // towerOfHanoi(4, "s", "H", "D");

    }
}
