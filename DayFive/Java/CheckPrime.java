public class CheckPrime{
    public static boolean check(int number){
    
    for(int count = 2; count <= number; count++){
        if(number % 2 == 1){
            return true;
            }
            }
            return false;
            }

    public static void main(String[] args){

    int number = 20;

    boolean result = check(number);

    System.out.println(result);
}
}
