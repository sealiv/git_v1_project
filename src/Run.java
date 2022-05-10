import java.math.BigInteger;

public class Run {
    public static void main(String[] args) {
        Math math = new Math();

        BigInteger a = BigInteger.valueOf(25);
        BigInteger b = BigInteger.valueOf(8);

        math.add(2,6,8,3);
        math.sqrt(17);
        math.add(a,b);
        math.sub(a,b);
        math.mult(a,b);
        math.div(a,b);
    }
}
