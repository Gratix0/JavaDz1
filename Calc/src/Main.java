import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans = 0.0;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /, ^, !): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            case '^': ans = Math.pow(num1, num2);
                break;
            case  '!':
                if (num1 == 0)
                    ans = 1;
                for (double i = 1.0; i < num2; i++)
                    ans = ans*i;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}