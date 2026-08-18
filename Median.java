public class Median{
    public static void main(String[] args){

    int[] number = {5, 7, 9};
    
    int smallest = number[0];
    for(number = 0; number < 3; number++){
        for(int count = 0; count < number; count++){

        if(number[count] > smallest){
            smallest = number[count];
        }
        
}
System.out.println(smallest);
}
}
}
