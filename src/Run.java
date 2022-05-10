import java.math.BigInteger;

public class Run {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(25);
        BigInteger b = BigInteger.valueOf(8);
        System.out.println(new Math().add(a,b));
        System.out.println(new Math().sub(a,b));
        System.out.println(new Math().mult(a,b));
        System.out.println(new Math().div(a,b));
    }
}
