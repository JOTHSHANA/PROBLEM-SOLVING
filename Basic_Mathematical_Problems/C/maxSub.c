#include<stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    int f = 0;
    if(n<5){
        f = 1;
    }
    if(f){
        printf("invalid");
        return 0;
    }
    int arr[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }
    int max = arr[0];
    int maxans = 0;
    int ans;
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(max<arr[j]){
                max = arr[j];
                ans = arr[i]-arr[j];
            }
            ans = arr[i]-arr[j];
            if(ans>maxans){
                maxans = ans;
            }
        }
    }
    
    printf("%d", maxans);
}