#include <stdio.h>
int main()
{
    int num;
    scanf("%d", &num);
    int value = 1;
    for (int i = 0; i < num; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            if (value <= num)
            {
                printf("%d ", value++);
            }
            else
            {
                return 0;
            }
        }
        printf("\n");
    }
    return 0;
}

/*

INPUT:10
OUTPUT:
1
2 3
4 5 6
7 8 9 10

*/