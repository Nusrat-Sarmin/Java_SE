/*Write  a program to find the factorial of a given number**/

package java_class_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int num,fact=1;
    System.out.print("Enter Positive Number:");
    num = input.nextInt();
    for(int i =num; i>=1; i--){
        fact = fact*i;
    }
        System.out.print("Factorial of Number:"+"="+fact);
    }
}
