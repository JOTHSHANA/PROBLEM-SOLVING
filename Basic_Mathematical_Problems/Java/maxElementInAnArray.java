import java.util.Scanner;
class maxElementInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}


/*

INPUT:
5       ----->array length
3
6
9
7
4
OUTPUT:
9

 */