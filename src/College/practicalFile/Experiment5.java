/*
 *
 * Experiment5.java
 * Java
 *
 * Created by Tanay on $today.day.month.year
 */

package College.practicalFile;

import java.util.Scanner;

import static College.printBox.printBox;

public class Experiment5 {
    public static void main(String[] ar)
    {
        printBox("Tanay", "1955991593");
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=obj.nextInt();
        int[] n =new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)
        {
            n[i]=obj.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("At "+i+"  index value is "+n[i]);
        }
        int rem,sum;
        int temp;
        for(int i=0;i<size;i++)
        {
            sum=0;
            temp=i;
            while(temp>0)
            {
                rem=temp%10;
                temp=temp/10;
                sum=sum+(rem*rem*rem);

            }
            if(i==sum)
            {
                System.out.println("armstrong Index value is "+sum);
                n[i]=i;
            }
        }
        System.out.println();
        System.out.println("........ After Replacement.......\n ");
        for(int i=0;i<size;i++)
        {
            System.out.println("At "+i+"  index value is "+n[i]);
        }
    }
}
