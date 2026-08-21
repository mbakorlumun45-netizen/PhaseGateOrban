public class AddToBecomeOne{
    public static int add(int number){

    int sumNum = 0;

    int count = 0;

    while(count != 0){

        int lastNum = number % 10;

        sumNum += lastNum;

        number /= 10;
        }
        return sumNum;
        } 
}
