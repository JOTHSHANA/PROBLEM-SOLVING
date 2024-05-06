#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);

    int rot;
    scanf("%d", &rot);

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    // right rotation

    // rot = rot%n;
    // for(int i =0; i < rot; i++){
    //     int temp = arr[0];
    //     for(int j= 0; j < n-1; j++){
    //         arr[j] = arr[j+1];
    //     }
    //     arr[n-1] = temp;
    // }

    // left rotation
    rot = rot % n;
    for (int i = 0; i < rot; i++)
    {
        int temp = arr[n - 1];
        for (int j = n - 1; j > 0; j--)
        {
            arr[j] = arr[j - 1];
        }
        arr[0] = temp;
    }

    for (int i = 0; i < n; i++)
    {
        printf("%d", arr[i]);
    }
    return 0;
}