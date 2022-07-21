/*Write a program to sum of user input until users input ‘q’ from keyboard*/

package java_class_2;

import java.util.Scanner;

public class SumOfUserInput {
    public static void main(String[] args) {
        int num,sum=0;
         System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        try{
            do {
            num = scanner.nextInt();
            sum = sum + num;
            System.out.println(sum);
        } while (num != 'q');
        }
        catch(Exception e){
            System.out.println("Enter valid number");
        }

    }
}

