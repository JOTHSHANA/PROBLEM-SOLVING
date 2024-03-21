import java.util.Scanner;

class numOfOccurenceOfADigit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int digit, count = 0;
        int target = input.nextInt();
        while(n!=0){
            digit = n % 10;
            if(digit == target){
                count++;
            }
            n = n/10;
        }
        System.out.print(count);
    }
}


/*

INPUT:
23341333
3
OUTPUT:
5

*/