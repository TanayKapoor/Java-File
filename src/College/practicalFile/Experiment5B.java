package College.practicalFile;

import java.util.Arrays;
import java.util.Scanner;

import static College.printBox.printBox;

public class Experiment5B {
    public static int[] removeElements(int[] arr, int key){
        int index = 0;
        for (int i = 0; i<arr.length; i++)
            if (arr[i] % key != 0)
                arr[index++] = arr[i];

            return Arrays.copyOf(arr, index);
    }

    public static void main(String[] args) {
        printBox("Tanay", "1955991593");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.print("Enter number whose multiple you want to delete: ");
        int key = sc.nextInt();
        array = removeElements(array, key);
        System.out.println(Arrays.toString(array));
    }
}