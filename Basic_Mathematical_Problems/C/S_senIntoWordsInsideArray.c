#include <stdio.h>
#include <string.h>
#define MW 10
#define WL 20

int main()
{
    char str[100];
    fgets(str, sizeof(str), stdin);

    char word[MW][WL];
    int k = 0;
    int l = 0;
    for (int i = 0; i < strlen(str); i++)
    {
        if (str[i] == ' ')
        {
            word[k][l] = '\0';
            k++;
            l = 0;
            continue;
        }
        word[k][l] = str[i];
        l++;
    }

    word[k][l] = '\0';

    for (int i = 0; i <= k; i++)
    {
        printf("%s\n", word[i]);
    }
}