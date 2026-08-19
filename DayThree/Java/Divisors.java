public class Divisors{
    public static int divNum(int number){

    int numDiv = 0;
    for(int count = 0; count <= number; count++){

        if(count % number == 0){
            numDiv = numDiv + 1;
    }
    }
    return numDiv;
    }

public static void main(String[] args){
     int number = 100;

    int result = divNum(number);

    System.out.println(result);    
}
}
