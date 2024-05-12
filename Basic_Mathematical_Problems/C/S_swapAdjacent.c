#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];
    scanf("%s", &str);

    int curr = 0;
    int nxt = 1;

    for (int i = 0; i < strlen(str) / 2; i++)
    {
        int temp = str[curr];
        str[curr] = str[nxt];
        str[nxt] = temp;
        curr += 2;
        nxt += 2;
    }

    printf("%s", str);
}