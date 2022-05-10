import java.math.BigInteger;

public class Math {
    public int add(int a, int b) {
        System.out.println("This is add method");
        System.out.println("This is add method for 2 params");
        return a + b;
    }

    public BigInteger add(BigInteger a, BigInteger b) {
        System.out.println("This is add method for 2 Biginteger params");
        return a.add(b);
    }

    public int add(int a, int b, int c) {
        System.out.println("This is add method for 3 params");
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        System.out.println("This is add method for 4 params");
        return a + b + c + d;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public BigInteger sub(BigInteger a, BigInteger b) {
        return a.subtract(b);
    }

    public int div(int a, int b) {
        return a / b;
    }

    public BigInteger div(BigInteger a, BigInteger b) {
        return a.divide(b);
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public BigInteger mult(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }

    public double sqrt(int a) {
        return java.lang.Math.sqrt(a);
    }
}
