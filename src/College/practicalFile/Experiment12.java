/*
 *
 * Experiment12.java
 * Java-File
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import College.printBox;

class Experiment12 {
    static class fibbonaci extends Thread{
        public void run(){
            int n1=0,n2=1,n3,i,count=10;
            System.out.print(n1+" "+n2);

            for(i=2;i<count;++i)
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
            System.out.println(" ");
        }
    }

    static class largestInArray extends Thread{
        public void run(){
            int arr[] = {10, 324, 45, 90, 9808};
            int max = arr[0];
            for (int i = 1; i < arr.length; i++)
                if (arr[i] > max)
                    max = arr[i];

            System.out.println("Largest in given array is " + max);
        }
    }

    static class armstrong extends Thread{
        public void run(){
            int number = 371, originalNumber, remainder, result = 0;

            originalNumber = number;

            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }

            if(result == number)
                System.out.println(number + " is an Armstrong number.");
            else
                System.out.println(number + " is not an Armstrong number.");
        }
    }

    static class bubbleSort extends Thread{
        public void run(){
            int arr[] = {64, 34, 25, 12, 22, 11, 90};
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        printBox.printBox("Tanay 1955991593");
        fibbonaci t1 = new fibbonaci();
        largestInArray t2 = new largestInArray();
        armstrong t3 = new armstrong();
        bubbleSort t4 = new bubbleSort();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


