#include <stdio.h>
#include <string.h>

int main()
{
    char str1[128];
    scanf("%s", &str1);

    char str2[128];
    scanf("%s", &str2);

    if (strlen(str1) != strlen(str2))
    {
        printf("not anagrams");
        return 0;
    }

    for (int i = 0; i < strlen(str1); i++)
    {
        for (int j = 0; j < strlen(str1); j++)
        {
            if (str1[i] == str2[j])
            {
                str1[i] = '0';
                str2[j] = '0';
                j = strlen(str1);
            }
        }
    }

    for (int i = 0; i < strlen(str1); i++)
    {
        if (str1[i] != '0')
        {
            printf("not anagrams");
            return 0;
        }
    }
    printf("anagrams");

    return 0;
}