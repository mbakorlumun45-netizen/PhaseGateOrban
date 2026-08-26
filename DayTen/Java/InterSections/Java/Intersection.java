public class Intersection{



    public boolean doubleArray(int[] numbers){

    for(int num = 0; num < numbers.length; num++){

            for(int count = 0; count < numbers.length; count++){

                if(num != count && numbers[num] == numbers[count]){

                        return true;
                       }
                      }
                    }
                    return false;
                    }
//public static void main(String[] args){
//
//    int[] numbers = {1,2,3,5};
//
//    boolean result = doubleArray(numbers);
//
//    System.out.println(result);
//    } 
}

