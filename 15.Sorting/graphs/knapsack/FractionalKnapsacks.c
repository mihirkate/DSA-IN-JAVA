#include <stdio.h>
int max(int a,int b){
    return ((a>b)?a:b);
}
int knapsack(int val[], int wt[], int W, int items)
{
    // base case
    if (W == 0 || items == 0)
    {
        return 0;
    }
    // knapscak
    if (wt[items-1] <= W)
    {
        // include
        int ans1 = val[items - 1] + knapsack(val, wt, W - wt[items - 1], items - 1);
        // exclude
        int ans2 = knapsack(val, wt, W, items - 1);
        return max(ans1,ans2);
    }
    else
    {// totaly excluding 
            return knapsack(val, wt, W, items - 1);
    }
        printf(knapsack(val, wt, W, items - 1));
}
int main()
{
    int val[] = {15, 14, 10, 45, 30};
    int wt[] = {2, 5, 1, 3, 4};
    int W = 7;
    int n=sizeof(val)/sizeof(val[0]);   
    
    printf(" the Max profit is %d",knapsack(val,wt,W,n));
}