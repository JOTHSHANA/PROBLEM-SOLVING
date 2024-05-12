#include<stdio.h>
#include<string.h>
#define MAX 128

int main(){
    char str[MAX];
    fgets(str, sizeof(str), stdin);
    
    int arr[MAX] = {0};
    
    for(int i = 0; i < strlen(str); i++){
        int cc = str[i];
        arr[cc]++;
    }
    
    int maxnum = arr[0];
    int maxchar;
    
    for(int i = 0; i<MAX;i++){
        if(maxnum<arr[i]){
            maxnum = arr[i];
            maxchar = i;
        }
    }
    
    printf("%c - %d", maxchar, maxnum);
    return 0;
}