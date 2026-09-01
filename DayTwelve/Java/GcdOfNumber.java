public class GcdOfNumber{
    public static int commonFactor(int numberOne, int numberTwo){

        int gcd = 0;

        for (int count = 1; count <= numberOne && count <= numberTwo; count++) {

            if (numberOne % count == 0 && numberTwo % count == 0) {
                gcd = count;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {

        int numberOne = 12;
        int numberTwo = 18;

        int result = commonFactor(numberOne, numberTwo);

        System.out.println(result);
    }
}
