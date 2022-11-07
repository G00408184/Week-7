package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        int loop = 1;
        while (loop > 0) {
            System.out.println("please enter a number between 0-9 :");
            Scanner myscan = new Scanner(System.in);
            try {
                int myNum = myscan.nextInt();

                if (myNum <= 9 && myNum > 0) {
                    System.out.println("you entered " + myNum);
                    loop--;
                } else {
                    System.out.println("Not a valid number");
                }
            } catch (InputMismatchException ime) {
                System.out.println("error recieved");
            }
        }
    }
    }

