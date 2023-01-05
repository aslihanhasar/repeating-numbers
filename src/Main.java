import java.util.Scanner;

public class Main {
    static int[] receivingArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static boolean isInclude(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static void printNumbers(int[] arr) {
        for (int i : arr) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }

    static void repeatingEvenNumbers(int[] arr) {
        int[] storageArr = new int[arr.length];
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] % 2 == 0) && (arr[i] == arr[j]) && (i != j)) {
                    if (!isInclude(storageArr, arr[i])) {
                        storageArr[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        System.out.println("Repeating even numbers in the array:");
        printNumbers(storageArr);
    }

    public static void main(String[] args) {
        repeatingEvenNumbers(receivingArray());
    }
}