#include<stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    
    int arr[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }
    
    int product = 1;
    int sum = 0;
    for(int i = 0; i < n; i++){
        product*=arr[i];
        sum+=arr[i];
    }
    
    printf  ("%d, %d", sum, product);
}