package Q1;

import java.util.Scanner;

class ReverseString {
        public static void main (String[] args) {
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
            Scanner sc= new Scanner(System.in);
            System.out.print("Input a string to reverse:");
            String userstring=sc.nextLine();

            if (userstring == null || userstring.trim().isEmpty()){
                System.out.println("Sorry, I cannot accept an empty string.");
            }
            else{
            String reversestring="";
            char ch;

            for (int i=0; i<userstring.length(); i++)
            {
                ch= userstring.charAt(i);
                reversestring= ch+reversestring;
            }
            System.out.println("Reversed word: "+ reversestring);}
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        }
    }

