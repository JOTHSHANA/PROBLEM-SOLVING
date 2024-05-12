#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    int h, m, s;
    char str[100];
    fgets(str, sizeof(str), stdin);

    if (strlen(str) != 9)
    {
        printf("invalid");
    }
    else if (sscanf(str, "%2d:%2d:%2d", &h, &m, &s) != 3)
    {
        printf("invalid");
    }
    else if (h > 23 || h < 0 || m > 59 || m < 0 || s > 59 || s < 0)
    {
        printf("invalid");
    }
    else
    {
        printf("valid");
    }
}