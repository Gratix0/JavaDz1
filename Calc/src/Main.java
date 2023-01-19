import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int wonnaexit;
        int divisionby0 = 0;
        double num1;
        double num2;
        double ans = 1.0;
        char op;
        while (true) {

            try {
            Scanner reader = new Scanner(System.in);
            System.out.print("If you wont next press any key. If you wont exit enter 0: ");
            wonnaexit = reader.nextInt();
            if (wonnaexit == 0) {
                break;
            }
                System.out.print("Enter two numbers: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();
                System.out.print("\nEnter an operator (+, -, *, /, ^, !): ");
                op = reader.next().charAt(0);
                switch (op) {
                    case '+':
                        ans = num1 + num2;
                        break;
                    case '-':
                        ans = num1 - num2;
                        break;
                    case '*':
                        ans = num1 * num2;
                        break;
                    case '/':
                        if (num1 == 0)
                            divisionby0 = 1;
                        if (num2 == 0)
                            divisionby0 = 1;
                        ans = num1 / num2;
                        break;
                    case '^':
                        ans = Math.pow(num1, num2);
                        break;
                    case '!':
                        for (double i = 1.0; i <= num1; i++)
                            ans = ans * i;
                        break;
                    default:
                        System.out.printf("Error! Enter correct operator");
                        return;
                }

        if (divisionby0 == 1) {
            System.out.print("You division by zero\n");
            break;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.print(ans + "\n");
        }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}