#include <stdio.h>
#include <string.h>

int main()
{
    char str[128];
    scanf("%s", &str);

    for (int i = 0; i < strlen(str); i++)
    {
        for (int j = i + 1; j < strlen(str); j++)
        {
            if (str[i] == str[j])
            {
                str[i] = '0';
                str[j] = '0';
                j = strlen(str);
            }
        }
    }

    for (int i = 0; i < strlen(str); i++)
    {
        if (str[i] != '0')
        {
            printf("%c", str[i]);
            break;
        }
    }

    return 0;
}