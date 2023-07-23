#include <stdio.h>
void printArray(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
int binarySearch(int *arr, int si, int ei, int key)
{

    // int mid = si + (ei - si) / 2;
    // base case
    int mid = (si + ei) / 2;
    //base
    if (si >= ei)
    {
        return -1;
    }
    if (key == arr[mid])
    {
        return mid;
    }
    if (key < mid)
    {
    return binarySearch(arr, si, mid - 1, key);
    }
    if (key > mid)
    {
    return binarySearch(arr, mid + 1, ei, key);
    }

    return -1;
}
int main()
{
    int arr[] = {2, 3, 4, 5, 8, 10, 40, 45};
    int n = sizeof(arr) / sizeof(arr[0]);
    int key = 36;
    printArray(arr, n);
    int f = binarySearch(arr, 0, n-1, key);
    
    if (f == -1)
    {
        printf("element not found ");
    }
    else
    {
        printf("element found at %d in the array ", f);
    }
    return 0;
}

