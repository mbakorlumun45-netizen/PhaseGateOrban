import java.util.Scanner;

public class Factorial{

    public static int factorialOfNum(int number){

    int product = 1;
    for(int count = 1; count <= number; count++){
     int next = count - 1;
        product = product * count;
    }
    return product;
    }

public static void main(String[] args){

Scanner input = new Scanner (System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    int result = factorialOfNum(number);

    System.out.println(result);
    }
}
