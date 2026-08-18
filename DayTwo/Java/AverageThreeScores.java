import java.util.Scanner;
public class AverageThreeScores{
    public static int ThreeScore(int number){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a score: ");
    int score = input.nextInt();

    if(score >= 90 && score <= 100){
        return 'A';
    }

    else if(score >= 80 && score < 90){
        return 'B';
    }

    else if(score >= 70 && score < 80){
        return 'C';
    }

    else if(score >= 60 && score < 70){
        return 'D';
    }else{
        return 'F';
    }
    }

public static void main(String[] args){

int result = ThreeScore(score);

System.out.println(result);
    
}
}
