package utils;

import java.math.BigInteger;

public class MyUUID {
    private static AtomicBigInteger atomicBigInteger = new AtomicBigInteger(BigInteger.ZERO);

    public static BigInteger next() {
        return atomicBigInteger.incrementAndGet();
    }

    public static void reset() {
        atomicBigInteger.reset(BigInteger.ZERO);
    }

}
