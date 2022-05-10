import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Math {
    public int add(int a, int b) {
        System.out.println("This is add method");
        System.out.println("This is add method for 2 params");
        int result = a + b;
        log("add", result, a, b);
        return result;
    }

    public BigInteger add(BigInteger a, BigInteger b) {
        System.out.println("This is add method for 2 Biginteger params");
        BigInteger result = a.add(b);
        log("add", result, a, b);
        return result;
    }

    public int add(int a, int b, int c) {
        System.out.println("This is add method for 3 params");
        int result = a + b + c;
        log("add", result, a, b, c);
        return result;
    }

    public int add(int a, int b, int c, int d) {
        System.out.println("This is add method for 4 params");
        int result = a + b + c + d;
        log("add", result, a, b, c, d);
        return result;
    }

    public int sub(int a, int b) {
        int result = a - b;
        log("sub", result, a, b);
        return result;
    }

    public BigInteger sub(BigInteger a, BigInteger b) {
        BigInteger result = a.subtract(b);
        log("sub", result, a, b);
        return result;
    }

    public int div(int a, int b) {
        int result = a / b;
        log("div", result, a, b);
        return result;
    }

    public BigInteger div(BigInteger a, BigInteger b) {
        BigInteger result = a.divide(b);
        log("div", result, a, b);
        return result;
    }

    public int mult(int a, int b) {
        int result = a * b;
        log("mult", result, a, b);
        return result;
    }

    public BigInteger mult(BigInteger a, BigInteger b) {
        BigInteger result = a.multiply(b);
        log("mult", result, a, b);
        return result;
    }

    public double sqrt(int a) {
        double result = java.lang.Math.sqrt(a);
        log("sqrt", result, a);
        return result;
    }

    private void log(String methodName, Object result, Object ... params) {
        String paramString = Arrays.stream(params)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.printf("%s(%s) = %s%s", methodName, paramString, String.valueOf(result), System.lineSeparator());
    }
}
