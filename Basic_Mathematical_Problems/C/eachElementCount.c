#include <stdio.h>
#define MAX_SIZE 100
int main()
{
    int n;
    scanf("%d", &n);

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    int occ[MAX_SIZE] = {0};

    for (int i = 0; i < n; i++)
    {
        occ[arr[i]]++;
    }

    for (int i = 0; i < MAX_SIZE; i++)
    {
        if (occ[i] > 0)
        {
            printf("%d-%d\n", i, occ[i]);
        }
    }

    return 0;
}