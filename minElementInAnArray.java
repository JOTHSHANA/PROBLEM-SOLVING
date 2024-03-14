import java.util.Scanner;
class MinElementInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}


/*

INPUT:
5
3
6
9
7
4
OUTPUT:
3

*/