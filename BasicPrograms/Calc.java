package BasicPrograms;
import java.util.Scanner;

class Calc {
    public static void main(String args[]){
        int num1,num2;
        Scanner s=new Scanner(System.in);
        Calculator c=new Calculator();
        System.out.println("Enter first number : ");
        num1=s.nextInt();
        System.out.println("Enter Second number : ");
        num2=s.nextInt();
        c.addNumbers(num1, num2);
        c.SubtractNumbers(num1, num2);
        s.close();
    }
}

class Calculator{
    int result;
    public void addNumbers(int a, int b){
        result=a+b;
        System.out.println("The Addition is " + result);
    }

    public void SubtractNumbers(int a, int b){
        result=a-b;
        System.out.println("The Subtraction is " + result);
    }
}