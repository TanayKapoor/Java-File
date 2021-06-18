/*
 *
 * Experiment3.java
 * Java
 *
 * Copyright (c) Tanay 2021.
 */

package College.practicalFile;

import java.util.Scanner;

public class Experiment3 {
    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter three four digit numbers: ");
        for (int i = 0; i < 3; i++)
            num[i] = s1.nextInt();
        int[] unit, tenth, hundredth, thousandth;
        unit = new int[3];
        tenth = new int[3];
        hundredth = new int[3];
        thousandth = new int[3];

        for (int i = 0; i < 3; i++) {//for unit place
            unit[i] = num[i] % 10;
        }
        for (int i = 0; i < 3; i++) {//for tenth place
            int temp = num[i];
            temp = temp / 10;
            tenth[i] = temp % 10;
        }
        for (int i = 0; i < 3; i++) {//for hundredth place
            int temp = num[i];
            temp = temp / 100;
            hundredth[i] = temp % 10;
        }
        for (int i = 0; i < 3; i++) {//for thousandth place
            int temp = num[i];
            temp = temp / 1000;
            thousandth[i] = temp % 10;

        }


        int max_unit = unit[0], min_unit = unit[0], max_tenth = tenth[0], min_tenth = tenth[0], max_hundredth = hundredth[0], min_hundredth = hundredth[0], max_thousandth = thousandth[0], min_thousandth = thousandth[0];
        //For unit place
        for (int i = 1; i < 3; i++) {
            if (max_unit < unit[i]) {
                max_unit = unit[i];
            }
            if (min_unit > unit[i]) {
                min_unit = unit[i];
            }
        }
        //For tenth place
        for (int i = 1; i < 3; i++) {
            if (max_tenth < tenth[i]) {
                max_tenth = tenth[i];
            }
            if (min_tenth > tenth[i]) {
                min_tenth = tenth[i];
            }
        }
        //For hundredth place
        for (int i = 1; i < 3; i++) {
            if (max_hundredth < hundredth[i]) {
                max_hundredth = hundredth[i];
            }
            if (min_hundredth > hundredth[i]) {
                min_hundredth = hundredth[i];
            }
        }
        //For thousandth place
        for (int i = 1; i < 3; i++) {
            if (max_thousandth < thousandth[i]) {
                max_thousandth = thousandth[i];
            }
            if (min_thousandth > thousandth[i]) {
                min_thousandth = thousandth[i];
            }
        }
        int diff_thousandth = max_thousandth - min_thousandth;
        int diff_hundredth = max_hundredth - min_hundredth;
        int diff_tenth = max_tenth - min_tenth;
        int diff_unit = max_unit - min_unit;

        String key = "[" + diff_thousandth + "]" + "[" + diff_hundredth + "]" + "[" + diff_tenth + "]" + "[" + diff_unit + "]";
        System.out.println("The final Key is: " + key);
    }
}

