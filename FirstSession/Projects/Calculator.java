package FirstSession.Projects;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        System.out.println("---------------------");

        int op;
        do {
            System.out.print("Choose a number of the operation: ");
            op = sc.nextInt();
        } while (op < 1 || op > 4);

        System.out.print("Enter the first number: ");
        float num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        float num2 = sc.nextInt();

        System.out.println("---------------------");

        switch (op) {
            case 1:
                float sum = num1 + num2;
                System.out.println(sum);
                break;
            case 2:
                float sub = num1 - num2;
                System.out.println(sub);
                break;
            case 3:
                float multi = num1 * num2;
                System.out.println(multi);
                break;
            case 4:
                float div = num1 / num2;
                System.out.println(div);
        }
    }
}
