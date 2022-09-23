package com.assignments;
import java.util.*;
class Calculator{
    public void sum(double a, double b){
        double result = a + b;
        System.out.println(result);
    }
    public void subtraction(double a, double b){
        double result = a - b;
        System.out.println(result);
    }
    public void multiply(double a, double b){
        double result = a * b;
        System.out.println(result);
    }
    public void division(double a, double b){
        double result = a / b;
        System.out.println(result);
    }
}
class UpdatedCalculator extends Calculator{
    public void remainder(double a, double b){
        double result = a % b;
        System.out.println(result);
    }
}
public class ppa1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        Calculator c = new Calculator();
        c.sum(n1, n2);
        c.subtraction(n1, n2);
        c.multiply(n1, n2);
        c.division(n1, n2);
        UpdatedCalculator uc = new UpdatedCalculator();
        uc.remainder(n1, n2);
    }

}
