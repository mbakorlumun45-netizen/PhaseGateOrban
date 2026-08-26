public class AddOneToLast {

    public static int[] addition(int[] numbers) {

        numbers[numbers.length - 1] = numbers[numbers.length - 1] + 1;

        return numbers;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        int[] result = addition(numbers);

        for (int count = 0; count < result.length; count++) {

            System.out.print(result[count] + " ");
        }
    }
}
