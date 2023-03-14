import java.util.Scanner;

/*
A positive number that contains a zero digit is called Duck Number.
The important point to note is that numbers with only leading zeroes are not Duck numbers.
For example, 3056, 10045, 7770 are Duck Numbers while the numbers such as 012, 0045, 01444 are not Duck numbers.
*/

public class Main{
    public static boolean isDuckNumber(int num){
        while(num != 0) {
            if(num%10 == 0)
                return true;
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting range:");
        int startingRange = sc.nextInt();

        System.out.println("Enter the ending range:");
        int endingRange = sc.nextInt();

        int counter = 0;

        for(int i = startingRange; i <= endingRange; i++){
            if(isDuckNumber(i)){
                System.out.print(i + "  ");
                counter++;
            }
        }
        System.out.println("\n" + counter + " occurrences");
    }
}