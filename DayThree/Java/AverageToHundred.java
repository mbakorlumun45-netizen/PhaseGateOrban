public class AverageToHundred{
    public static int hundred(int number){

    int sum = 0;
    int average = 0;

    for(int count = 1; count <= number; count++){
        sum = count + count;

        average = sum / number;         
    }
    return average;
    }

public static void main(String[] args){

    int number = 100;

    int result = hundred(number);

    System.out.println(result);
    }
  }
