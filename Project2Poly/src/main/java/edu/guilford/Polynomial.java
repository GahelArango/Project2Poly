package edu.guilford;

import java.util.Arrays;
import java.util.Random;

public class Polynomial implements Comparable<Polynomial>{
 private double[] coefficients;
    private int degree;

   // Create a default constructor
    public Polynomial() {
        this.degree = 0;
        this.coefficients = new double[1];
    }

    // Create a Constructor with coefficients array
    public Polynomial(double[] coefficients) {
        this.degree = coefficients.length - 1;
        this.coefficients = Arrays.copyOf(coefficients, coefficients.length);
    }

      // Generate a constructor that should accept a degree 𝑛 and generate a polynomial of that degree with random coefficients
      //  limit the coefficients to values in the range [–15., 15.].
    public Polynomial(int degree) {
        this.degree = degree;
        this.coefficients = new double[degree + 1];
        Random random = new Random();
        for (int i = 0; i <= degree; i++) {
            this.coefficients[i] = random.nextDouble() * 30 - 15;
        }
    }

   // Create a getter that returns the degree

    public int getDegree() {
        return this.degree;
    }
    // Create a getter that returns an array of all coefficients up to the degree
    public double[] getCoefficients() {
        return Arrays.copyOf(this.coefficients, this.degree + 1);
    }

    // Create a getter that returns a coefficient for any specified power
    public double getCoefficient(int power) {
        if (power >= 0 && power <= this.degree) {
            return this.coefficients[power];
        }
        return 0.0;
    }


    public void setCoefficient(int power, double value) {
        if (power >= 0 && power <= this.degree) {
            this.coefficients[power] = value;
        }
    }

    // create an evaluation method that has a parameter x and returns the value of the polynomial evaluated at that value of 𝑥
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i <= this.degree; i++) {
            result += this.coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    // Create a clear method that sets all coefficents to 0
    public void clear() {
        for (int i = 0; i <= this.degree; i++) {
            this.coefficients[i] = 0.0;
        }
    }
   

   // Creat an method that adds polynomials
    public Polynomial add(Polynomial p) {
        int maxDegree = Math.max(this.degree, p.getDegree());
        double[] resultCoefficients = new double[maxDegree + 1];

        for (int i = 0; i <= this.degree; i++) {
            resultCoefficients[i] += this.coefficients[i];
        }

        for (int i = 0; i <= p.getDegree(); i++) {
            resultCoefficients[i] += p.getCoefficient(i);
        }

        return new Polynomial(resultCoefficients);
    }

    // Create a subtract method
    public Polynomial subtract(Polynomial p) {
        int maxDegree = Math.max(this.degree, p.getDegree());
        double[] resultCoefficients = new double[maxDegree + 1];

        for (int i = 0; i <= this.degree; i++) {
            resultCoefficients[i] += this.coefficients[i];
        }

        for (int i = 0; i <= p.getDegree(); i++) {
            resultCoefficients[i] -= p.getCoefficient(i);
        }

        return new Polynomial(resultCoefficients);
    }

    // Write a CompareTo method
    @Override
    public int compareTo(Polynomial otherPolynomial) {
        if (this.degree == otherPolynomial.degree) {
            // Check if coefficients are the same
            for (int i = 0; i <= this.degree; i++) {
                if (this.coefficients[i] != otherPolynomial.coefficients[i]) {
                    // Compare values at x=1
                    if (this.evaluate(1) > otherPolynomial.evaluate(1)) {
                        return 1;
                    } else if (this.evaluate(1) < otherPolynomial.evaluate(1)) {
                        return -1;
                    }
    
                    // If values at x=1 are equal, compare values at x=2
                    if (this.evaluate(2) > otherPolynomial.evaluate(2)) {
                        return 1;
                    } else if (this.evaluate(2) < otherPolynomial.evaluate(2)) {
                        return -1;
                    }
    
                    return 0; // The polynomials are equal in all coefficients and values
                }
            }
        } else if (this.degree > otherPolynomial.degree) {
            return 1;
        } else {
            return -1;
        }
    
        return 0; // The polynomials are equal in all coefficients and values
    }

    // Write a ToString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = this.degree; i >= 0; i--) {
            if (this.coefficients[i] != 0.0) {
                sb.append(this.coefficients[i]);
                if (i > 0) {
                    sb.append("x^").append(i);
                } else {
                    sb.append("x^0");
                }
                if (i > 0 && i <= this.degree) {
                    sb.append(" + ");
                }
            }
        }
        return sb.toString();
    }

    
}