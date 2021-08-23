/*
 *
 * Experiment7A.java
 * Java-File
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import College.printBox;

class Student1 {
    int rollno; //instance variable
    String name;
    static String college = "Chitkara";//static variable

    //constructor
    Student1(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}

public class Experiment7A {
    public static void main(String args[]){
        printBox.printBox("Tanay", "1955991593");
        Student1 s1 = new Student1(593,"Tanay");
        Student1 s2 = new Student1(590,"Sumit");

        s1.display();
        s2.display();
    }
}
