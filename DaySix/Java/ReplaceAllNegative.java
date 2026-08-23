public class ReplaceAllNegative{
public static int[] allNegative(int[] numbers) {

    for (int count = 0; count < numbers.length; count++) {

        if (numbers[count] < 0) {
            numbers[count] = 0;
        }
        }

    return numbers;
}

public static void main(String[] args) {

    int[] numbers = {5, -2, 8, -10, 3, -7};

    int[] result = allNegative(numbers);

    for (int count = 0; count < result.length; count++) {
        System.out.print(result[count] + " ");
    }
}
}
