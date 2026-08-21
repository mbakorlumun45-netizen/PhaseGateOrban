public class LargestOfThree{
    public static int largest(int number1, int number2, int number3){

    int largest = number1;

    if(number2 > largest){
        largest = number2;
        }

    if(number3 > largest){
        largest = number3;  
        } 
        return largest;
        }

    public static void main(String[] args){

    int number1 = 10;

    int number2 = 20;

    int number3 = 30;

    int result = largest(number1, number2, number3);

    System.out.println(result);
}
}
