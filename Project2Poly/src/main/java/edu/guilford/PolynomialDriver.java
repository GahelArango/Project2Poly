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

       
        System.out.println("");
        System.out.println("Testing subtraction of polynomials");
        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        Polynomial p4 = p1.subtract(p2);
        System.out.println("Subtraction result");
        System.out.println(p4);

 System.out.println("");
        System.out.println("Testing evaluation of polynomials");
        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        System.out.println("Polynomial 1 evaluated at 2.0: " + p1.evaluate(2.0));
        System.out.println("Polynomial 2 evaluated at 2.0: " + p2.evaluate(2.0));

        System.out.println("");
        System.out.println("Testing clearing of polynomials");
        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        p1.clear();
        p2.clear();

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);
 
        // Test the getDegree method
        System.out.println("");
        System.out.println("Testing getDegree method");
        System.out.println("Polynomial 1 degree: " + p1.getDegree());
        System.out.println("Polynomial 2 degree: " + p2.getDegree());

        // Test the getCoefficient method
        System.out.println("");
        System.out.println("Testing getCoefficient method");
        System.out.println("Polynomial 1 coefficient at 2: " + p1.getCoefficient(2));
        System.out.println("Polynomial 2 coefficient at 2: " + p2.getCoefficient(2));

        // Test the setCoefficient method
        System.out.println("");
        System.out.println("Testing setCoefficient method");
        p1.setCoefficient(2, 3.0);
        p2.setCoefficient(2, 3.0);
        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        //Test the equals method
        System.out.println("");
        System.out.println("Testing equals method");
        System.out.println("Polynomial 1 equals Polynomial 2: " + p1.equals(p2));

        // Test the hashCode method
        System.out.println("");
        System.out.println("Testing hashCode method");
        System.out.println("Polynomial 1 hashCode: " + p1.hashCode());
        System.out.println("Polynomial 2 hashCode: " + p2.hashCode());




    }
}
