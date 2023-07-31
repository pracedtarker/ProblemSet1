package Q3;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

class RandomArrays {
    public static void main(String[] args) {
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number greater than 100:");
        int usernumber = sc.nextInt();
        if (usernumber <= 100) {
            System.out.println("Sorry, I cannot accept numbers less than or equal to 100");
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        } else {
            // chose a Character random from this String
            String ATGCstring = "ATGC";
            StringBuilder ranString = new StringBuilder();
            Random rnd = new Random();
            while (ranString.length() < usernumber) { // length of the random string.
                int index = (int) (rnd.nextFloat() * ATGCstring.length());
                ranString.append(ATGCstring.charAt(index));
            }
            String ranStringcomplete1 = ranString.toString();

            StringBuilder ranString2 = new StringBuilder();
            Random rnd2 = new Random();
            while (ranString2.length() < usernumber) { // length of the random string.
                int index = (int) (rnd2.nextFloat() * ATGCstring.length());
                ranString2.append(ATGCstring.charAt(index));
            }
            String ranStringcomplete2 = ranString2.toString();

            char[] chArray1 = ranStringcomplete1.toCharArray();
            char[] chArray2 = ranStringcomplete2.toCharArray();
            int count = 0;
            int indexcount = 0;
            for(int i=0;i<usernumber;i++) {
                int j;
                for (j = 1; j < usernumber; j++) {
                    if (chArray1[i] == chArray2[j - 1]) {
                        char grabChar = Array.getChar(chArray1, i);
                        if (grabChar == 'G') {
                            count++;
                            if (count == 4)
                            {
                                indexcount = i;

                            }

                        }
                    }

                }
            }
                System.out.println("The index of consecutive letters 'G' is: " +indexcount);
                System.out.print("Current Time in milliseconds = ");
                System.out.println(System.currentTimeMillis());
            }
        }
    }
