#include <stdio.h>
void printArray(int *a, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf(" %d", a[i]);
    }
    printf("\n");
}
void selection(int *arr, int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        // assigning the first element as the min
        int min = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[min] > arr[j])
            {
                min = j;
            }
        }
        // swapping
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
int main()
{
    int a[] = {3, 5, 12, 2, 15, 0, 50};
    // dry run
    // if (arr[min] > arr[j])
    // 3, 5, 12, 2, 15, 0, 50
    // 0  5 12 2 15 3 50
    //  0 2 12 5 15 3 50
    //  0 2 3 5 12 50
    //
    int n = sizeof(a) / sizeof(a[0]);
    // int n=5;
    printf("Before\n");
    printArray(a, n);
    selection(a, n);
    printf("After\n");
    printArray(a, n);

    return 0;
}
