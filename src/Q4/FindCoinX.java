package Q4;

import java.util.*;
import java.util.Scanner;

public class FindCoinX {
    public static void main(String[] args) {
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of coins in your bag: ");
        int usernumber = sc.nextInt();
        if(usernumber == 0) {
            System.out.println("Sorry, you must input a number greater than zero.");
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        } else
        {
            int[] userIntArray;
            userIntArray = new int[usernumber];
            for (int i = 0; i < usernumber; i++) {
                userIntArray[i] = i + 1;
            }
            int userNumMinusOne = usernumber-1;
            System.out.println("Next, we are going to select a number from your bag and remove it. "
                    + "Select a number between 1 and " + userNumMinusOne +
                    " and I will decide a number to be marked X: ");
            Scanner sc2 = new Scanner(System.in);
            int usernumber2 = sc2.nextInt();
            if (usernumber2 < 1 | usernumber2 > userNumMinusOne)
            {System.out.println("Sorry, I cannot accept that value.");
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());}
            else {
                int removedNumber = usernumber2 + 1;
                int[] arr_new = new int[userIntArray.length - 1];
                int j = removedNumber;
                for (int i = 0, k = 0; i < userIntArray.length; i++) {
                    if (userIntArray[i] != j) {
                        arr_new[k] = userIntArray[i];
                        k++;
                    }
                }
                System.out.println(Arrays.toString(arr_new));
                int n = usernumber;
                int expectedSum = n * (n + 1) / 2;
                int trueSum = 0;
                int difference;
                for (int i = 0; i < n - 1; i++) {
                    trueSum += arr_new[i];
                }
                difference = expectedSum - trueSum;
                System.out.println("The number marked X is: " + difference);
                System.out.print("Current Time in milliseconds = ");
                System.out.println(System.currentTimeMillis());
            }
        }
    }
}
