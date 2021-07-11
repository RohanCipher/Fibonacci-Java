//Fibonacci series  0 1 1 2 3 5 8.......
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0, b=1, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get series: ");
        int scanned = input.nextInt();
        if(scanned < 1){
            System.out.println("Wrong Input: Enter any value above 0");
        }
        else{
            System.out.println("The Fibonacci series is");
            for(int i=0; i < scanned; ++i) {
                System.out.print(a + " ");
                c = a;
                a = b;
                c = c + b;
                b = c;
        }
            }
        }
    }
