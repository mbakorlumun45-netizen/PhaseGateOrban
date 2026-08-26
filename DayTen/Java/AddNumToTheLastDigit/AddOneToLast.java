public class AddOneToLast{
    public static int[] addition(int[] numbers){

    int add = 0;
    for(int count = 0; count < 3; count++){
        
        add = add + (numbers[2] + 1);        
    }
    return numbers;
    } 

public static void main(String[] args){

    int[] numbers = {1,2,3};

    int[] result = addition(numbers);

    for(int count = 0; count < result.length; count++){

    System.out.println(result);
}
}
}

