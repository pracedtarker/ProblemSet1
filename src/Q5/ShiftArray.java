package Q5;

import java.util.Random;
import java.util.Scanner;

class RandomArrays {
    public static void main(String[] args) {
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number of the size of your array: ");
        int usernumber = sc.nextInt();
        if (usernumber == 0){
            System.out.println("Sorry, I cannot accept inputs less than 1.");
        }
        else {
            Random rd = new Random();
            int[] arr = new int[usernumber];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rd.nextInt();
            }
            System.out.println("The numbers for your array are: ");
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
            }
            System.out.println("]");
            System.out.print("Next, select the number of places you would like to shift your array. " +
                    "Enter a number that is less than the size of your array: ");
            Scanner sc2 = new Scanner(System.in);
            int usernumber2 = sc.nextInt();
            if(usernumber2 >= usernumber){
                System.out.println("Sorry, you did not enter a number less than the size of your array.");
                System.out.print("Current Time in milliseconds = ");
                System.out.println(System.currentTimeMillis());
            }
            else{
                for(int i = 0; i < usernumber2; i++){
                    int j, last;
                    last = arr[arr.length-1];
                    for(j = arr.length-1; j > 0; j--){
                        arr[j] = arr[j-1];
                    }
                    arr[0] = last;
                }
                System.out.println("This is your array after it has been shifted " +usernumber2 + " places: ");
                System.out.print("[");
                for(int i = 0; i< arr.length; i++){
                    System.out.print(arr[i] + "  ");
                }
                System.out.println("]");
                System.out.print("Current Time in milliseconds = ");
                System.out.println(System.currentTimeMillis());
            }
        }
    }
}
