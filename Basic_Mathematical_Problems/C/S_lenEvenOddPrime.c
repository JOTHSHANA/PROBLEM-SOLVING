#include <stdio.h>
#include <string.h>

int isPrime(int n)
{
    if (n == 0 || n == 1)
    {
        return 0;
    }
    else if (n == 2)
    {
        return 1;
    }
    else if (n % 2 == 0)
    {
        return 0;
    }
    else
    {
        for (int i = 3; i < n; i = i + 2)
        {
            if (n % i == 0)
            {
                return 0;
            }
        }

        return 1;
    }
}

int main()
{
    char str[100];
    scanf("%s", &str);

    int len = strlen(str);
    if (isPrime(len))
    {
        printf("prime");
    }
    else if (len % 2 == 0)
    {
        printf("even");
    }
    else if (len % 2 != 0)
    {
        printf("odd");
    }

    return 0;
}