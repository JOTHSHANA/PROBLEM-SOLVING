// Odd and even digit sum of a 4-digit number

#include<stdio.h>
int main(){
    int number;
    scanf("%d", &number);
    int num = number;
    int ans1 = num%10;
    num = num / 10;
    num = num/10;
    int ans2 = num % 10;
    int evensum = ans1 +ans2;
    
    num = number;
    
    num = num / 10;
    int ans3 = num%10;
    num = num / 10;
    num = num/10;
    int ans4 = num % 10;
    int oddsum = ans3 +ans4;
    
    
    
    printf("%d %d", oddsum, evensum);
}