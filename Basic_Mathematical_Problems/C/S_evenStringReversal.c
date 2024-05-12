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

    for (int i = 1; i < n; i = i + 2)
    {
        for (int j = strlen(arr[i]) - 1; j >= 0; j--)
        {
            printf("%c", arr[i][j]);
        }
        printf("\n");
    }
}