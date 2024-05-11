#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];
    fgets(str, sizeof(str), stdin);
    if (str[strlen(str) - 1] == '\n')
    {
        str[strlen(str) - 1] = '\0';
    }

    int length = strlen(str);
    int start = 0;
    int end;
    for (int i = 0; i <= length; i++)
    {
        if (str[i] == ' ' || str[i] == '\0')
        {
            end = i - 1;
            while (start < end)
            {
                int temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
            start = i + 1;
        }
    }

    for (int i = length - 1; i >= 0; i--)
    {
        printf("%c", str[i]);
    }

    return 0;
}

//reversing each word in a sentence