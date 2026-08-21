import java.util.Scanner;
public class LargestOfThree{
    public static int largest(int number1, int number2, int number3){
    
    Scanner input = new Scanner(System.in);

    int largest = number1;
    for(int count = 1; count <= 3; count++){
        if(largest < number){
            largest = number;
            }
            }
            return largest;
            }       

    public static void main(String[] args){

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    int result = largest(number1, number2, number3);

    System.out.println(result);
}
}
