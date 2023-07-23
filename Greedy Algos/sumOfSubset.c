#include <stdio.h>
void backtrack(int arr[], int n, int path[], int path_len, int curr_sum, int targetSum, int start, int *nodes_visited)
{
    (*nodes_visited)++;
    if (curr_sum == targetSum)
    {
        printf("{");
        for (int i = 0; i < path_len; i++)
        {
            printf(" %d ", path[i]);
        }
        printf("}\n");
        return;
    }
        for (int i = start; i < n; i++)
        {
            if (curr_sum + arr[i] > targetSum)
            {
                continue;
            }
            path[path_len] = arr[i];
            backtrack(arr, n, path, path_len + 1, curr_sum + arr[i], targetSum, i + 1, nodes_visited);
        }
    }

void subset(int arr[], int n, int targetSum)
{
    int path[n];
    int path_len = 0;
    int curr_sum = 0;
    int nodes_visited=0;
    backtrack(arr, n, path, path_len ,curr_sum, targetSum, 0,& nodes_visited);
    printf("Nodes visited: %d \n", nodes_visited);
}
int main()
{
    int n;                                                                                                                                                                                                               
    printf("enter the No. elements in the Array\n");
    scanf("%d", &n);
    int arr[n];
    printf("enter the  elements of the Array\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    int targetSum;
    printf("enter targetSum\n");
    scanf("%d", &targetSum);
    subset(arr, n, targetSum);

    return 0;
}