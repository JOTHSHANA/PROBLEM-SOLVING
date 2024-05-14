#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
    char str[300];
    scanf("%s", &str);
    int curr = 0;
    int found = 0;
    int ans;

    for (int i = 0; i < strlen(str); i++)
    {
        if (isdigit(str[i]))
        {
            curr = curr * 10 + (str[i] - 48);
            found = 1;
        }
        else
        {
            if (found)
            {
                found = 0;
                ans = ans + curr;
                curr = 0;
            }
        }
    }

    if (found)
    {
        ans = ans + curr;
    }

    printf("%d", ans);
}