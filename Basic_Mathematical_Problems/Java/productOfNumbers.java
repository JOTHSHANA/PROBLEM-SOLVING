import java.util.Scanner;

public class productOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int num;
        int result =1;
        for(int i = 0; i < t; i++){
            num = input.nextInt();
            result = result * num;
        }
        System.out.print(result);

    }
}


/*

INPUTS:
3      ------>number of inputs to multiply
3
5
3
OUTPUT:
45

*/