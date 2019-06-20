package thread.traning;

import java.math.BigInteger;

public class BigIntegerFactorial {
	public BigInteger factorial(int n) {
		BigInteger bigInt = BigInteger.ONE;

		for (int i = 2; i <= n; i++) {
			bigInt = bigInt.multiply(BigInteger.valueOf(i));
		}

		return bigInt;
	}
}
