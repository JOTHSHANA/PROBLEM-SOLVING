#include <stdio.h>
#include <stdlib.h>
int compare(const void *a, const void *b) {
    return (*(int*)a - *(int*)b);
}

int main() {
    int array[] = {5, 3, 9, 1, 7};
    int n = sizeof(array) / sizeof(array[0]);
    qsort(array, n, sizeof(int), compare);

    printf("Sorted array in ascending order: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");

    return 0;
}
