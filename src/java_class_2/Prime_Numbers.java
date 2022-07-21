/*Write a program to print prime numbers from 2 to n */

package java_class_2;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Positive Number:");

        int num= input.nextInt();
        int count = 0;
         for(int i= 2; i<num; i++){
             if(num%i==0){
                 count ++;
                 break;
             }
         }
        if(count == 0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }
    }
}
