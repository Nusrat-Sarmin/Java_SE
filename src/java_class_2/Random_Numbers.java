/*Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.*/

package java_class_2;
import java.util.Scanner;

public class Random_Numbers {
    public static void main(String[] args) {

            int G = 0, count = 0;
            int N_One = (int)(Math.random() * (10-1) + 1);
            int N_Two = (int)(Math.random() * (10-1) + 1);

            System.out.println("Enter Number");
            Scanner input = new Scanner(System.in);

            for (int i = 1; i <= 10; i++) {
                if (input.hasNextInt()) {
                    G = input.nextInt();
                    if (G == N_One || G == N_Two) {
                        count += 1;
                        System.out.println("One point");
                    } else if (G < N_One || G < N_Two) {
                        System.out.println("No Point");
                    } else if (G > N_One || G > N_Two) {
                        System.out.println("Zero Point");
                    }
                    if (i == 10) {
                        System.out.println("Wrong Number");
                        break;
                    }
                } else {
                    System.out.println("Enter right number");
                    break;
                }

            }
            System.out.println(" " + count );

    }
    }
    
        