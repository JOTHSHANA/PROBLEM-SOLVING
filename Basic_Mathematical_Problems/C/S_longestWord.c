#include <stdio.h>
#include <string.h>
#define MAXW 10
#define MAXL 100

int main()
{
    char str[100];
    fgets(str, sizeof(str), stdin);

    char word[MAXW][MAXL];
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

    int len = 0;
    char ans[30];
    for (int i = 0; i <= k; i++)
    {
        if (len < strlen(word[i]))
        {
            len = strlen(word[i]);
            strcpy(ans, word[i]);
        }
    }

    printf("%s", ans);
}