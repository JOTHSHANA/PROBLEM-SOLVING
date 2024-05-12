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
    int maxlen = strlen(word[0]);
    int minlen = strlen(word[0]);
    char *largest = word[0];
    char *smallest = word[0];
    for (int i = 0; i <= k; i++)
    {
        if (strlen(word[i]) > maxlen)
        {
            maxlen = strlen(word[i]);
            largest = word[i];
        }
        if (strlen(word[i]) < minlen)
        {
            minlen = strlen(word[i]);
            smallest = word[i];
        }
    }

    printf("Smallest: %s, Largest: %s\n", smallest, largest);
    return 0;
}