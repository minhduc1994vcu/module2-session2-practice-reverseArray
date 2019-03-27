import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("enter the size of number less than 20");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size exceed 20");
            }
        }
        while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter element " + i);
            array[i] = scanner.nextInt();
        }
//        System.out.printf("%-20s%s", "Elements in array: ", "");
        System.out.println("elements in array");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("\b");
        int temp;
        for (int j = 0; j < array.length / 2; j++) {
            temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;

        }
        System.out.println("elements in array after reverse");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
