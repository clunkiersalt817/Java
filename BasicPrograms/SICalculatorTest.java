package BasicPrograms;
import java.util.Scanner;

class SICalculatorTest {
    public static void main(String args[]){
    SICalculator c = new SICalculator();
    Scanner s = new Scanner(System.in);

    double baseAmount;
    double interest;
    double duration;  
    
    baseAmount=s.nextDouble();
    interest=s.nextDouble();
    duration=s.nextDouble();

    c.SIcalc(baseAmount, interest, duration);
    s.close();
    }    
}

class SICalculator{
    double result;
    public void SIcalc(double a,double b,double c){
        result=a+(a*b*c/100);
        System.out.println("the total amount to be paid is : " + result);
    }
}
