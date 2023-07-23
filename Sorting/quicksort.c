#include <stdio.h>

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];
    int i = si - 1;
    for (int j = si; j < ei; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    i++;
    int temp = arr[ei];
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
}

void quickSort(int arr[], int si, int ei) {
    if (si >= ei) {
        return;
    }
    int pIdx = partition(arr, si, ei);
    quickSort(arr, si, pIdx - 1);
    quickSort(arr, pIdx + 1, ei);
}

int main() {
    int arr[] = { 1, 8, 3, 9, 5, 4 };
    int n = sizeof(arr) / sizeof(arr[0]);
    printArray(arr, n);
    quickSort(arr, 0, n - 1);
    printArray(arr, n);
    return 0;
}
