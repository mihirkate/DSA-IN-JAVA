#include <stdio.h>
int binary(int *arr, int si, int ei, int key)
{
    si = 0;
    //  ei = n - 1;
    while (si <= ei)
    {
        int mid = (si + ei) / 2;
        if (key == arr[mid])
        {
            printf("element found at %d ", mid);
        }
        if (key > mid)
        {
            si = (mid + 1);
        }
        else
        {
            ei = (mid - 1);
        }
    }
    return -1;
}
void printArray(int *a, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf(" %d", a[i]);
    }
    printf("\n");
}
int main()
{
    int arr[] = {1, 2, 4, 5, 7};
    int n = sizeof(arr) / sizeof(arr[0]);
    // int n = 5;

    printArray(arr, n);
    // int found = binary(arr, 0, n - 1, 5);
    printf(binary(arr, 0, n - 1, 5));
    printArray(arr, n);
}