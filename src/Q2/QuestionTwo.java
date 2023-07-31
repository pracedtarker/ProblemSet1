package Q2;

import java.util.Scanner;

class ReverseSubString {
    public static void main(String[] args) {
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string to generate a new string " +
                "of the concatenated reversed substrings of even and odd indexes: ");
        String userstring = sc.nextLine();

        if (userstring == null || userstring.trim().isEmpty()) {
            System.out.println("Sorry, I cannot accept an empty string.");
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        } else {
            String strA = userstring;
            String even = "";
            String odd = "";
            for (int j = 0; j < strA.length(); j++) {
                if (j % 2 == 0) {
                    even += strA.charAt(j);
                } else {
                    odd += strA.charAt(j);
                }
            }
            String reverseEven = "";
            String reverseOdd = "";
            char chEven;
            char chOdd;
            for (int i = 0; i < even.length(); i++)
            {
                chEven = even.charAt(i);
                reverseEven = chEven+reverseEven;
            }
            for (int i = 0; i < odd.length(); i++)
            {
                chOdd = odd.charAt(i);
                reverseOdd = chOdd+reverseOdd;
            }

            System.out.println("The result is: " + reverseEven + reverseOdd);

            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        }
    }
}