import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int sum = 0;
    int average = 0;
    int count = 0;
    while(count < 10){
        System.out.print("Enter a score: ");
        int score = input.nextInt();
        sum = sum + score;
        average = sum / 10;
        count++;
        }
         
        System.out.println(average);     
    }
}
