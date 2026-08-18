import java.util.Scanner;
public class helloName{
    public static void main(String[] args){

   Scanner input = new Scanner(System.in);

    System.out.print("Enter a name: ");
    String name = input.nextLine();

    System.out.println("Hello." +name); 
}
}
