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

    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; )
        {
            if (arr[j] == arr[i])
            {
                for (int k = j; k < n - 1; k++)
                {
                    arr[k] = arr[k + 1];
                }
                n--;
            }
            else{
                j++;
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        printf("%d", arr[i]);
    }

    return 0;
}