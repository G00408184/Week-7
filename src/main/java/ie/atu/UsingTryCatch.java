package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("please enter a number between 0-9 :");
        try {
            Scanner myscan = new Scanner(System.in);
            int myNum = myscan.nextInt();

            if (myNum <= 9 && myNum > 0) {
                System.out.println("you entered " + myNum);
            } else {
                System.out.println("Not a valid number");
            }
        }
            catch(InputMismatchException f)
            {
                System.out.println("error recieved");
            }
        }

    }

