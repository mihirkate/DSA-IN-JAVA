#include <stdio.h>
void mergesort(int arr[], int si, int ei)
{

    // si = 0;
    // int n = sizeof(arr) / sizeof(arr[0]);
    // ei = n - 1;
    if (si >= ei)
    {
        return;
    }
    int mid = (si + ei) / 2;        
    mergesort(arr, si, mid);
    mergesort(arr, mid + 1, ei);
    mergeArray(arr, si, mid, ei);
        
}
void mergeArray(int arr[], int si, int mid, int ei)
{

    int i = si;
    int j = mid + 1;
    int k = 0;
    int temp[ei - si + 1];
    while (i <= mid && j <= ei)
    {
        if (arr[i] > arr[j])
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        else
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
    }
    while (i <= mid)
    {
        temp[k++] = arr[i++];
        // k++;
    }
    while (j <= ei)
    {
        temp[k++] = arr[j++];
        // k++;
    }
    for (k = 0, i = si; k < (ei - si + 1); k++, i++)
    {
        arr[i] = temp[k];
    }
}
void printArray(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf(" %d", a[i]);
    }
    printf("\n");
}
int main(void)
{
    int arr[] = {9, 20, 40, 10, 25, 27};
    int n = sizeof(arr) / sizeof(arr[0]);
    printArray(arr, n);
    mergersort(arr, 0, n - 1);
    printArray(arr, n);
}