public class LeapYear{
    public static int threeSixSix(){

    int counter = 0;

    for(int count = 1900; count <= 2025; count++){

        if(count % 4 == 0){

            counter++;
            }
            }
            return counter;
            }

public static void main(String[] args){

    int result = threeSixSix();

    System.out.println(result);
    }
}
