public class DuplicateElements{
public static int[] element(int[] numbers) {

    int duplicateCount = 0;

    for (int count = 0; count < numbers.length; count++) {

        for (int counter = count + 1; counter < numbers.length; counter++) {

            if (numbers[count] == numbers[counter]) {
                duplicateCount++;
                break;
            }
        }
    }

    int[] duplicates = new int[duplicateCount];

    int index = 0;

    for (int count = 0; count < numbers.length; count++) {

        for (int counter = count + 1; counter < numbers.length; counter++) {

            if (numbers[count] == numbers[counter]) {

                duplicates[index] = numbers[count];
                index++;
                break;
            }
        }
    }

    return duplicates;
}

public static void main(String[] args) {

    int[] numbers = {2, 5, 7, 2, 8, 5, 9};

    int[] result = element(numbers);

    for (int count = 0; count < result.length; count++) {
        System.out.print(result[count] + " ");
    }
}
}
