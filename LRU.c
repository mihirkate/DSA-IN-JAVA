#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Number of data points
#define N 10

// Number of clusters
#define K 2

// Maximum number of iterations
#define MAX_ITER 100

// Data points
float data[N][2] = {{2, 3}, {3, 4}, {10, 12}, {8, 9}, {20, 25}, {25, 30}, {30, 35}, {80, 85}, {82, 80}, {90, 91}};

// Cluster centers
float centers[K][2];

// Cluster assignments for each data point
int assignments[N];

// Function to compute distance between two points
float distance(float x1, float y1, float x2, float y2)
{
    return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
}

// Function to assign each data point to the nearest cluster
void assignClusters()
{
    for (int i = 0; i < N; i++)
    {
        float minDist = distance(data[i][0], data[i][1], centers[0][0], centers[0][1]);
        assignments[i] = 0;

        for (int j = 1; j < K; j++)
        {
            float dist = distance(data[i][0], data[i][1], centers[j][0], centers[j][1]);
            if (dist < minDist)
            {
                minDist = dist;
                assignments[i] = j;
            }
        }
    }
}

// Function to update cluster centers
void updateCenters()
{
    int counts[K] = {0};
    float sumX[K] = {0};
    float sumY[K] = {0};

    for (int i = 0; i < N; i++)
    {
        int cluster = assignments[i];
        sumX[cluster] += data[i][0];
        sumY[cluster] += data[i][1];
        counts[cluster]++;
    }

    for (int j = 0; j < K; j++)
    {
        if (counts[j] > 0)
        {
            centers[j][0] = sumX[j] / counts[j];
            centers[j][1] = sumY[j] / counts[j];
        }
    }
}

int main()
{
    // Initialize cluster centers randomly
    for (int i = 0; i < K; i++)
    {
        centers[i][0] = data[i][0];
        centers[i][1] = data[i][1];
    }

    // Run K-Means algorithm
    for (int iter = 0; iter < MAX_ITER; iter++)
    {
        assignClusters();
        updateCenters();
    }

    // Print final cluster assignments and centers
    printf("Final cluster assignments:\n");
    for (int i = 0; i < N; i++)
    {
        printf("Data point (%.1f, %.1f) belongs to cluster %d\n", data[i][0], data[i][1], assignments[i]);
    }

    printf("\nFinal cluster centers:\n");
    for (int j = 0; j < K; j++)
    {
        printf("Cluster %d center: (%.1f, %.1f)\n", j, centers[j][0], centers[j][1]);
    }

    return 0;
}
