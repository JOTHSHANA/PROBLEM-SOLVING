#include <stdio.h>
#include <string.h>

int main()
{
    int n;
    scanf("%d", &n);

    char arr[n][20];
    for (int i = 0; i < n; i++)
    {
        scanf("%s", arr[i]);
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < strlen(arr[i]); j++)
        {
            printf("%c", arr[j][i]);
        }
        printf("\n");
    }
}