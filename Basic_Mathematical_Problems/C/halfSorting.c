// sorting the 1st half in ascending and 2nd half in descending(array length-always even)

#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    int half = n / 2;

    for (int i = 0; i < half; i++)
    {
        for (int j = 0; j < half - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    for (int i = 0; i < half; i++)
    {
        printf("%d ", arr[i]);
    }

    for (int i = half; i < n - 1; i++)
    {
        for (int j = half; j < n - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    for (int i = n - 1; i >= half; i--)
    {
        printf("%d ", arr[i]);
    }
}