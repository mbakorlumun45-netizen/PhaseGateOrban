public class PalindromePrime{
    public static void main(String[] args){

    int number = 11211;

    int store = number;

    int reversedNum = 0;
    for(int count = 1; store > 0; count++){

    int num = store % 10;

    store = store / 10;

    reversedNum =  reversedNum * 10 + num;
    }
        
    }

    System.out.println(reversedNum);

}
}
