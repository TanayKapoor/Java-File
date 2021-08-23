/*
 *
 * Experiment10B.java
 * Java-File
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import College.printBox;

interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable,Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }
}

public class Experiment10B {
    public static void main(String args[]){
        printBox.printBox("Tanay 1955991593");
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
