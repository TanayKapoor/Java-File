/*
 *
 * Experiment5C.java
 * Java-File
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import java.util.Arrays;
import java.util.Scanner;

import static College.printBox.printBox;


public class Experiment5C {
    private static int[] insert(int[] a, int key, int index)
    {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }
        result[index] = key;
        for (int i = index + 1; i <= a.length; i++) {
            result[i] = a[i - 1];
        }
        return result;
    }

    public static void main(String[] args)
    {
        printBox("Tanay", "1955991593");
        int large,small;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[n];
        for(int i = 0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }

        large=small=array[0];
        for(int i=1;i<n;++i)
        {
            if(array[i]>large)
                large=array[i];

            if(array[i]<small)
                small=array[i];
        }

        System.out.println("The smallest element is "  + small );
        System.out.println("The largest element is "  + large );

        array = insert(array, small, n/2);
        array = insert(array, large, (n/2)+1);

        System.out.println("Array after insertion is: ");
        System.out.println(Arrays.toString(array));
    }
}