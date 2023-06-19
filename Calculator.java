import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        float num1, num2, result;
        String oper;        
        Scanner sc = new Scanner(System.in);        
        System.out.print("\nEnter the First Operand: ");
        num1 = sc.nextFloat();
        System.out.print("Enter the Second Operand: ");
        num2 = sc.nextFloat();
        System.out.print("Choose the operator (+, -, *, /): ");
        oper = sc.next();
        sc.close();
        switch (oper) {
            case "+":
                result = num1 + num2;
                System.out.println("\nAddition for the expression " + "(" + num1 + " " + oper + " " + num2+ ")" + " is : "+result+"\n");
                break;
            case "-":
                result = num1 - num2;
                System.out.println("\nSubtraction for the expression " + "(" + num1 + " " + oper + " " + num2+ ")" + " is : "+result+"\n");
                break;
            case "*":
                result = num1 * num2;
                System.out.println("\nMultiplication for the expression " + "(" + num1 + " " + oper + " " + num2+ ")" + " is : "+result+"\n");
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("\n for the expression " + "(" + num1 + " " + oper + " " + num2+ ")" + " is : "+result+"\n");
                } else {
                    System.out.println("\nError: Division by zero is not allowed."+"\n");
                }
                break;
            default:
                System.out.println("\nError: Invalid operator."+"\n");
                break;
            }
    }
}