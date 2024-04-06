#include <stdio.h>

int main()
{
    int rows, start;
    scanf("%d\n%d", &rows, &start);
    int value;
    for (int i = 0; i < rows; i++)
    {
        value = start + i;
        for (int j = 0; j <= i; j++)
        {
            printf("%d ", value);
        }
        printf("\n");
    }
    return 0;
}

/*

INPUT:
3
4
OUTPUT:
4
5 5
6 6 6

*/