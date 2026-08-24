public class AddIndex{
    public static int[] adding(int[] numbers){

    int[] sum = new int[];
    for(int count = 0; count < numbers.length; count++){
        if(numbers[count] % 2 == 0){
            sum = numbers[count] + 2;
                sum++;
        }else{
            sum = numbers[count] - 1;
            sum++;
            }
            }
            return sum; 
            }
    public static void main(String[] args){

    int[] numbers = {7,8,14,5,10};

    int[] result = adding(numbers);

    for(int count = 0; count < result.length; count++){
    System.out.println(result[count]);   
    }
   }
} 
