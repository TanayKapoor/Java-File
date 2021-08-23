/*
 *
 * Experiment7B.java
 * Java-File
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import College.printBox;

public class Experiment7B {
    int x;

    // Constructor with a parameter
    public Experiment7B(int x) {
        this.x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
        printBox.printBox("Tanay", "1955991593");
        Experiment7B myObj = new Experiment7B(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
