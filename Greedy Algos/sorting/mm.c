#include <stdio.h>

void input(int *ptr, int n);
void print(int *ptr, int n);
void dprint(double *ptr, int n);
void FractionalK(int *val, int *weight, double *ratio, int n, int max, double *item);

int main(void)
{
    printf("Fractional Knapsack\n");
    int n, max;
    printf("Entr n : ");
    scanf("%d", &n);

    int val[n], weight[n];
    double item[n];

    // input of all values and weights
    printf("Input all values : \n");
    input(val, n);
    printf("Input all weights : \n");
    input(weight, n);
    printf("Entr Max capacity : ");
    scanf("%d", &max);

    // printing of all values and Weights
    printf("\n***Before sorting the Arrays***\n");
    printf("Values : \n");
    print(val, n);
    printf("Weights : \n");
    print(weight, n);

    double ratio[n];
    {
        for (int i = 0; i < n; i++)
        {
            ratio[i] = ((val[i]) / (double)(weight[i]));
        }
        printf("Ratios : \n");
        dprint(ratio, n);

        // sorting the array
        int temp;
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                if (ratio[i] < ratio[j])
                {
                    // swap ratio
                    temp = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = temp;

                    // swap Values
                    temp = val[i];
                    val[i] = val[j];
                    val[j] = temp;

                    // swap Values
                    temp = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp;
                }
            }
        }
    }
    // arrays after sorting the data
    printf("\n***After sorting the data***\n");
    printf("Values : \n");
    print(val, n);
    printf("Weights : \n");
    print(weight, n);
    printf("Ratios : \n");
    dprint(ratio, n);
    FractionalK(val, weight, ratio, n, max, item);
}

void input(int *ptr, int n)
{
    printf("Enter the Values : \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &ptr[i]);
    }
    print(ptr, n);
}
void print(int *ptr, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", ptr[i]);
    }
    printf("\n");
}
void dprint(double *ptr, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%.3lf ", ptr[i]);
    }
    printf("\n");
}
void FractionalK(int *val, int *weight, double *ratio, int n, int max, double *item)
{
    int it = 0;
    double final = 0;
    for (int i = 0; i < n; i++)
    {
        if (max >= weight[i])
        {
            // include full item
            max -= weight[i];
            final += val[i];
            item[it] = (double)val[i];
            it++;
        }
        else
        {
            final += (double)(max * ratio[i]);
            int fraction = max * ratio[i];
            item[it] = (double)(fraction);
            max = 0;
            break;
        }
    }
    printf("Items in the fractional form in the knapsack : \n");
    dprint(item, n);
    printf("Final : %.2lf\n", final);
}