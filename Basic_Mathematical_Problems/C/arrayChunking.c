#include<stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    
    int arr[n];
    for(int i =0;i <n; i++){
        scanf("%d", &arr[i]);
    }
    
    int cs;
    scanf("%d", &cs);
    
    for(int i = 0; i < n; i+=cs){
        printf("[");
        for(int j = 0; j < cs && i+j<n; j++){
            printf("%d", arr[i+j]);
            if(j < cs-1 && i+j+1<n){
                printf(",");
            }
        }
        printf("]");    
    }
    
    
    printf("\n");
}