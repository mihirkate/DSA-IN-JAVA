#include <stdio.h>

void mergeSortDec(int arr[], int si, int ei) {
    if (si >= ei) {
        return;
    }
    int mid = (si + ei) / 2;
    mergeSortDec(arr, si, mid);
    mergeSortDec(arr, mid + 1, ei);
    mergearray(arr, si, mid, ei);
}

void mergearray(int arr[], int si, int mid, int ei) {
    int i = si;
    int j = mid + 1;
    int k = 0;
    int temp[ei - si + 1];
    while (i <= mid && j <= ei) {
        if (arr[i]<arr[j]) {
            temp[k] = arr[i];
            i++;
            k++;
        } else {
            temp[k] = arr[j];
            j++;
            k++;
        }
    }
    while (i <= mid) {
        temp[k++] = arr[i++];
    }
    while (j <= ei) {
        temp[k++] = arr[j++];
    }
    for (k = 0, i = si; k < (ei - si + 1); k++, i++) {
        arr[i] = temp[k];
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[] = { 9, 20, 40, 10, 25, 27 };
    int n = sizeof(arr) / sizeof(arr[0]);
    printArray(arr, n);
    mergeSortDec(arr, 0, n - 1);
    printArray(arr, n);
    return 0;
}
