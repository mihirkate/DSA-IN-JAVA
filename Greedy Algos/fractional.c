#include <stdio.h>
void printSubset(int * A, int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%*d", 5, A[i]);
    }
}
int comparator(const void *pLhs, const void *pRhs)
{
    int *lhs = (int *)pLhs;
    int *rhs = (int *)pRhs;
 
    return *lhs > *rhs;
}
int main()
{
    int arr = {1, 5, 7, 2};
    // int n = sizeof(arr) / sizeof(arr[0]);
    int n=4;
    printSubset(arr, n);
    return 0;
}