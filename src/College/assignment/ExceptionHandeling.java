package College.assignment;

import java.util.Scanner;

class UpperLimitCheck extends Exception {
    UpperLimitCheck(String s) {
        super(s);
    }
}

class StringLengthCheck extends Exception {
    StringLengthCheck(String s) {
        super(s);
    }
}

class EmployeeIdCheck extends Exception {
    EmployeeIdCheck(String s) {
        super(s);
    }
}

public class ExceptionHandeling {
    static void validateLimit(int upper) throws UpperLimitCheck {
        if (upper > 10)
            throw new UpperLimitCheck("Number of entries must be below 10!");
    }

    static void validateString(String s) throws StringLengthCheck {
        if (s.length() > 10)
            throw new StringLengthCheck("String ust be 10 characters long!");
    }

    static void validateEmployeeId(int id) throws EmployeeIdCheck {
        if (id > 100)
            throw new EmployeeIdCheck("Do not enter id greater than 100");
        else if (id < 0)
            throw new EmployeeIdCheck("Do not enter negative id");
    }

    public static void main(String[] args) {
        int a, b, c, id1, id2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter number of entries to be made: ");
        c = sc.nextInt();
        System.out.print("Enter 1st ID: ");
        id1 = sc.nextInt();
        System.out.print("Enter 2nd ID: ");
        id2 = sc.nextInt();

        try {
            System.out.println("Answer is: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by 0");
        }
        try {
            validateLimit(c);
            System.out.println("Your number of entries are: " + c);
        } catch (Exception m) {
            System.out.println(m);
        }
        try {
            validateString(str);
            System.out.println("String entered is: " + str);
        } catch (Exception n) {
            System.out.println(n);
        }
        try {
            validateEmployeeId(id1);
            System.out.println("Employee ID 1 is: " + id1);
        } catch (Exception o) {
            System.out.println(o);
        }
        try {
            validateEmployeeId(id2);
            System.out.println("Employee ID 2 is: " + id2);
        } catch (Exception p) {
            System.out.println(p);
        }
    }
}
