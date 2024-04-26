#include <stdio.h>
int main()
{
    int num;
    scanf("%d", &num);
    int n = num;
    int power = 1;
    int newNumber = 0;
    while (n != 0)
    {
        int digit = ((n % 10) + 1) % 10;
        newNumber += digit * power;
        power *= 10;
        n /= 10;
    }

    if (num == 9 && newNumber == 0)
    {
        printf("0");
    }
    else
    {
        printf("%d", newNumber);
    }
}