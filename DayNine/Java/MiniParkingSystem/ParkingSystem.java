import java.util.Scanner;

public class ParkingSystem {

    static int[] parkingLot = new int[20];

    public static void parkCar() {

        for (int count = 0; count < parkingLot.length; count++) {

            if (parkingLot[count] == 0) {

                parkingLot[count] = 1;

                System.out.println("Successfully parked");

                return;
            }
        }

        System.out.println("No space");
    }


    public static void parkCar(int slot) {

        int index = slot - 1;

        if (index < 0 || index >= parkingLot.length) {

            System.out.println("Invalid slot");

            return;
        }

        if (parkingLot[index] == 0) {

            parkingLot[index] = 1;

            System.out.println("Successfully parked");

        } else {

            System.out.println("No space");
        }
    }


    public static void removeCar(int slot) {

        int index = slot - 1;

        if (index < 0 || index >= parkingLot.length) {

            System.out.println("Invalid slot");

            return;
        }

        if (parkingLot[index] == 1) {

            parkingLot[index] = 0;

            System.out.println("Car successfully removed");

        } else {

            System.out.println("Slot is already empty");
        }
    }


    public static void displayStatus() {

        int available = 0;
        int occupied = 0;

        System.out.println();
        System.out.println("========== PARKING STATUS ==========");

        for (int count = 0; count < parkingLot.length; count++) {

            if (parkingLot[count] == 0) {

                System.out.println(
                    "Slot " + (count + 1) + ": Empty"
                );

                available++;

            } else {

                System.out.println(
                    "Slot " + (count + 1) + ": Occupied"
                );

                occupied++;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Available spaces: " + available);
        System.out.println("Filled spaces: " + occupied);
        System.out.println("====================================");
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("========== PARKING LOT ==========");
            System.out.println("1. Park car");
            System.out.println("2. Park car in a specific slot");
            System.out.println("3. Remove car");
            System.out.println("4. Display parking status");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");

            int choice = input.nextInt();


            if (choice == 1) {

                parkCar();

                displayStatus();

            } else if (choice == 2) {

                System.out.print("Enter slot number (1 - 20): ");

                int slot = input.nextInt();

                parkCar(slot);

                displayStatus();

            } else if (choice == 3) {

                System.out.print("Enter slot number: ");

                int slot = input.nextInt();

                removeCar(slot);

                displayStatus();

            } else if (choice == 4) {

                displayStatus();

            } else if (choice == 5) {

                System.out.println("Goodbye");

                break;

            } else {

                System.out.println("Invalid option");
            }
        }

        input.close();
    }
}
