/*
 *
 * Experiment6B.java
 * Java-File
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import College.printBox;

public class Experiment6B {
    public static void main(String[] args) {
        printBox.printBox("Tanay", "1955991593");
        int [] arr = new int [] {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
