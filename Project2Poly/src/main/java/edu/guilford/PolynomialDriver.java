package edu.guilford;

public class PolynomialDriver {
    public static void main(String[] args) {
        double[] coeff1 = {4.6, 3.3, 2.5, 1.0};
        Polynomial p1 = new Polynomial(coeff1);

        double[] coeff2 = {6.8, 5.6, 4.1};
        Polynomial p2 = new Polynomial(coeff2);

        System.out.println("Testing addition of polynomials");
        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        Polynomial p3 = p1.add(p2);
        System.out.println("Addition result");
        System.out.println(p3);

        System.out.println("Comparison result");
        System.out.println("Polynomial 1.compareTo(Polynomial 2) = " + p1.compareTo(p2));
    }
}
