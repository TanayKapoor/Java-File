/*
 *
 * Experiment4.java
 * Java
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import static College.printBox.printBox;

class Student {
    String name;
    String branch;
    int roll_num;
    String city;
    String phone;
    int cgpa;

    public Student() {
        this(" ", 0, " ", " ", " ", 0);
    }

    public Student(String Name, int roll, String b, String c, String ph, int score) {
        name = Name;
        roll_num = roll;
        branch = b;
        city = c;
        cgpa = score;
        phone = ph;
    }
}

public class Experiment4 {
    public static void main(String[] args) {
        printBox("Tanay", "1955991593");
        int count = 0;
        int pos = 0;
        int pos1 = 0;
        int pos2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.print("Enter first character to count: ");
        String[] names = new String[n];
        String[] city = new String[n];
        String[] greaterThan8 = new String[n];
        String[] branch = new String[n];
        String ch = sc.next();
        System.out.print("Enter city to find: ");
        String findCity = sc.next();
        System.out.println("Input student name, roll number, branch, city and cgpa: ");
        Student stu = new Student();

        for (int i = 0; i < n; i++) {
            stu.name = sc.next();
            stu.roll_num = sc.nextInt();
            stu.branch = sc.next();
            stu.city = sc.next();
            stu.cgpa = sc.nextInt();

            branch[i] = stu.branch;

            if (stu.name.charAt(0) == ch.charAt(0)) {
                count++;
                names[pos] = stu.name;
                pos++;
            }

            if (stu.city.equals(findCity)) {
                city[pos1] = stu.name;
                pos1++;
            }

            if (stu.cgpa >= 8) {
                greaterThan8[pos2] = stu.name;
                pos2++;
            }
        }

        System.out.print("There are " + count + " students starting with " + ch + " : ");
        String[] cleanedNames = Arrays.stream(names).filter(Objects::nonNull).toArray(String[]::new);
        System.out.println(Arrays.toString(cleanedNames));
        System.out.print("Students who belongs to " + findCity + " are: ");
        String[] cleanedCity = Arrays.stream(city).filter(Objects::nonNull).toArray(String[]::new);
        System.out.println(Arrays.toString(cleanedCity));
        System.out.print("Students with cgpa greater than 8 are: ");
        String[] cleanedCGPA = Arrays.stream(greaterThan8).filter(Objects::nonNull).toArray(String[]::new);
        System.out.println(Arrays.toString(cleanedCGPA));
        System.out.println("Branch details");
        Arrays.stream(branch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).forEach((key, value) -> System.out.println(value + "\t" + key));
    }
}
