import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int sum = 0;
    int count = 0;
    int totalSum = 0;
    
    System.out.print("Enter a score: ");
    int score = input.nextInt();
    while(count < 10){
        System.out.print("Enter a score: ");
        score = input.nextInt();
        count++;
        }
        sum = score + score;
        totalSum = sum + score;
         
        System.out.println(sum);     
    }
}
