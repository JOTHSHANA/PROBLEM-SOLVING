// removing duplicates
#include <stdio.h>
#include <string.h>
int main()
{
    char str[300];
    scanf("%s", &str);

    int len = strlen(str);

    for (int i = 0; i < len; i++)
    {
        for (int j = i + 1; j < len; j++)
        {
            if (str[i] == str[j])
            {

                for (int k = j; k < len - 1; k++)
                {
                    str[k] = str[k + 1];
                }
                len--;
                j--;
            }
        }
    }

    for (int i = 0; i < len; i++)
    {
        printf("%c", str[i]);
    }
}