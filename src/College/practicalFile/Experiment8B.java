/*
 *
 * Experiment8B.java
 * Java-File
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import College.printBox;

public class Experiment8B {
    {
        System.out.println("init");
    }
    Experiment8B()
    {
        System.out.println("default");
    }
    Experiment8B(int x)
    {
        System.out.println(x);
    }

    {
        System.out.println("second");
    }
    public static void main(String args[])
    {
        printBox.printBox("Tanay", "1955991593");
        new Experiment8B();
        new Experiment8B(10);
    }
}
