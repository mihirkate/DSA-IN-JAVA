#include <stdio.h>
void insertionSort(int arr[], int n)
{

    for (int i = 1; i < n; i++)
    {
        int curr = arr[i];
        int prev = i - 1;

        while (prev >= 0 && curr < arr[prev])
        { // swap
            arr[prev + 1] = arr[prev];
            prev--;
        }
        // printf(prev);
        arr[prev + 1] = curr;
        // printf(curr);
    }
}

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
int main()
{
    int arr[] = {12, 11, 13, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);
    printArray(arr, n);
    insertionSort(arr, n);
    printArray(arr, n);

    return 0;
}
