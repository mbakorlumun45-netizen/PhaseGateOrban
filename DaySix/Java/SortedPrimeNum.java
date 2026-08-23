public class SortedPrimeNum {

    public static int[] primeNum(int[] numbers) {

        int primeCount = 0;

        for (int count = 0; count < numbers.length; count++) {

            int divisorCount = 0;

            for (int divisor = 1; divisor <= numbers[count]; divisor++) {

                if (numbers[count] % divisor == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount == 2) {
                primeCount++;
            }
        }
        int[] primes = new int[primeCount];

        int index = 0;

        for (int count = 0; count < numbers.length; count++) {

            int divisorCount = 0;

            for (int divisor = 1; divisor <= numbers[count]; divisor++) {

                if (numbers[count] % divisor == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount == 2) {
                primes[index] = numbers[count];
                index++;
            }
        }

        for (int count = 0; count < primes.length - 1; count++) {

            for (int counter = 0; counter < primes.length - 1 - count; counter++) {

                if (primes[counter] > primes[counter + 1]) {

                    int swap = primes[counter];
                    primes[counter] = primes[counter + 1];
                    primes[counter + 1] = swap;
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {

        int[] numbers = {17, 4, 7, 10, 3, 11};

        int[] result = primeNum(numbers);

        for (int count = 0; count < result.length; count++) {
            System.out.print(result[count] + " ");
        }
    }
}
