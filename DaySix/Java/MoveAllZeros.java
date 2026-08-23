public class MoveAllZeros{
public static int[] moveZeros(int[] numbers) {

    int position = 0;

    for (int count = 0; count < numbers.length; count++) {

        if (numbers[count] != 0) {
            numbers[position] = numbers[count];
            position++;
        }
    }

    while (position < numbers.length) {
        numbers[position] = 0;
        position++;
    }

    return numbers;
}

public static void main(String[] args) {

    int[] numbers = {0, 5, 0, 8, 3, 0, 7};

    int[] result = moveZeros(numbers);

    for (int count = 0; count < result.length; count++) {
        System.out.print(result[count] + " ");
    }
}
}
