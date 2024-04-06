#include<stdio.h>
int main(){
    int num;
    scanf("%d", &num);
    for(int i = 1; i <= num; i++){
        for(int j = 1; j <= i; j++){
            printf("%d ", i);
        }
        printf("\n");
    }
    return 0;
}


/*

INPUT: 10
OUTPUT: 
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 6 6 
7 7 7 7 7 7 7 
8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 
10 10 10 10 10 10 10 10 10 10 

*/