/*Write a program to sum of numbers which only divisible by 5 from 1 to 100**/

package java_class_2;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int num = 100;
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " ");
                sum += i;
            }
        }
        System.out.println("Sum:" + sum);
    }
    }

