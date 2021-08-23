/*
 *
 * Experiment10A.java
 * Java-File
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import College.printBox;

abstract class Bike{
    abstract void run();
}

class Honda4 extends Bike {
    void run() {
        System.out.println("running safely..");
    }
}

public class Experiment10A {
    public static void main(String args[]){
        printBox.printBox("Tanay 1955991593");
        Bike obj = new Honda4();
        obj.run();
    }
}
