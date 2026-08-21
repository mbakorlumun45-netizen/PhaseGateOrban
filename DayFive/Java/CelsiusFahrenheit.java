public class CelsiusFahrenheit{
    public static double convert(double celsius){
    
    double fahrenheit = (9/5 * celsius) + 32;   

        return fahrenheit;
        }

    public static void main(String[] args){

    double celsius = 45;

    double result = covert(celsius);

    System.out.println(result);
}
}
