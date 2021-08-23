/*
 *
 * Experiment8A.java
 * Java-File
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import College.printBox;

class complexNumber {
    private double realNumber, imaginaryNumber;
    public complexNumber(double realNumber, double imaginaryNumber)
    {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }
    complexNumber(complexNumber copy)
    {
        System.out.println("Copy constructor called");
        realNumber = copy.realNumber;
        imaginaryNumber = copy.imaginaryNumber;
    }
    @Override
    public String toString()
    {
        return "(" + realNumber + " + " + imaginaryNumber + "i)";
    }
}
public class Experiment8A
{

    public static void main(String[] args) {
        printBox.printBox("Tanay", "1955991593");
        complexNumber ComplexNumberObject1 = new complexNumber(5, 10);
        complexNumber ComplexNumberObject2 = new complexNumber(ComplexNumberObject1);
        complexNumber ComplexNumberObject3 = ComplexNumberObject2;
        System.out.println(ComplexNumberObject2);
    }
}
